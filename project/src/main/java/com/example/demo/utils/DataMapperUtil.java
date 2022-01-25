package com.example.demo.utils;

import org.modelmapper.ModelMapper;
import com.example.demo.model.Employee;
import com.example.demo.dto.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class DataMapperUtil {
    private final ModelMapper modelMapper;

    DataMapperUtil() {
        this.modelMapper = new ModelMapper();
    }

    public Employee convertToModel(EmployeeDto employeeDto){
        return modelMapper.map(employeeDto, Employee.class);
    }

    public EmployeeDto convertToDto(Employee employee){
        return modelMapper.map(employee, EmployeeDto.class);
    }
}
