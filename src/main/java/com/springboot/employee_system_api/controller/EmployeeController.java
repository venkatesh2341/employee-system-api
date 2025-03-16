package com.springboot.employee_system_api.controller;

import com.springboot.employee_system_api.DTO.CreateEmployeeDTO;
import com.springboot.employee_system_api.entity.Employee;
import com.springboot.employee_system_api.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    private final EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("create-employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody CreateEmployeeDTO createEmployeeDto){

        return new ResponseEntity<>( employeeService.createEmployee(createEmployeeDto), HttpStatus.CREATED);
    }
}
