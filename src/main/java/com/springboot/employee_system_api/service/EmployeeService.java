package com.springboot.employee_system_api.service;

import com.springboot.employee_system_api.DTO.CreateEmployeeDTO;
import com.springboot.employee_system_api.DTO.EmployeeDTO;
import com.springboot.employee_system_api.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee createEmployee(CreateEmployeeDTO createEmployeeDTO);
    List<EmployeeDTO> getEmployees();
    void deleteEmployee(Long id);
}
