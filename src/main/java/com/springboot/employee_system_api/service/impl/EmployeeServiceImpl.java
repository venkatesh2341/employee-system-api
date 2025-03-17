package com.springboot.employee_system_api.service.impl;

import com.springboot.employee_system_api.DTO.CreateEmployeeDTO;
import com.springboot.employee_system_api.DTO.EmployeeDTO;
import com.springboot.employee_system_api.entity.Employee;
import com.springboot.employee_system_api.repository.EmployeeRepository;
import com.springboot.employee_system_api.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(CreateEmployeeDTO createEmployeeDTO) {

        Employee employee = Employee.builder()
                .firstName(createEmployeeDTO.getFirstName())
                .lastName(createEmployeeDTO.getLastName())
                .emailId(createEmployeeDTO.getEmailId())
                .build();
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeDTO> getEmployees() {
        List<Employee> employees =  employeeRepository.findAll();

        List<EmployeeDTO> employeeDTOS = employees.stream()
                .map(employee -> new EmployeeDTO(employee.getId(),
                                                employee.getFirstName(),
                                                employee.getLastName(),
                                                employee.getEmailId()))
                .toList();
        return employeeDTOS;
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> employee =  employeeRepository.findById(id);
        if(employee.isPresent()){
            employeeRepository.deleteById(id);
        }
    }
}
