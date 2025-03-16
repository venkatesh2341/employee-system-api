package com.springboot.employee_system_api.service;

import com.springboot.employee_system_api.DTO.CreateEmployeeDTO;
import com.springboot.employee_system_api.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employee createEmployee(CreateEmployeeDTO createEmployeeDTO);
}
