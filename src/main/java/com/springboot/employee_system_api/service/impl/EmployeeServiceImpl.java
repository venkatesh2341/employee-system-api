package com.springboot.employee_system_api.service.impl;

import com.springboot.employee_system_api.DTO.CreateEmployeeDTO;
import com.springboot.employee_system_api.entity.Employee;
import com.springboot.employee_system_api.repository.EmployeeRepository;
import com.springboot.employee_system_api.service.EmployeeService;
import org.springframework.stereotype.Service;

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
}
