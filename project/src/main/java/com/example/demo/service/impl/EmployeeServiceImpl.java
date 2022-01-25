package com.example.demo.service.impl;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.enums.StateEnum;
import com.example.demo.model.Employee;
import com.example.demo.utils.DataMapperUtil;
import org.springframework.stereotype.Service;
import com.example.demo.service.EmployeeService;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private DataMapperUtil dataMapperUtil;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
        employeeDto.setAccountState(StateEnum.ADDED);
        return updateOrCreate(employeeDto);
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        if(employeeDto.getId() == null) {
            throw new IllegalArgumentException("Employee ID can't be Null");
        }
        return updateOrCreate(employeeDto);
    }

    private EmployeeDto updateOrCreate(EmployeeDto employeeDto) {
        Employee employee = employeeRepository.save(dataMapperUtil.convertToModel(employeeDto));

        return dataMapperUtil.convertToDto(employee);
    }
}
