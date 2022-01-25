package com.example.demo.service;

import com.example.demo.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto create(EmployeeDto employeeDto);

    EmployeeDto update(EmployeeDto employeeDto);
}
