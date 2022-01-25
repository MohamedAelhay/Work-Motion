package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import static com.example.demo.api.response.ApiResponseHelper.OKApiResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity create(@RequestBody EmployeeDto employeeDto) {
        return OKApiResponse(employeeService.create(employeeDto));
    }

    @PatchMapping
    public ResponseEntity update(@RequestBody EmployeeDto employeeDto) {
        return OKApiResponse(employeeService.update(employeeDto));
    }
}
