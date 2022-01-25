package com.example.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.enums.StateEnum;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void whenCreateEmployee_EmployeeState_ShouldBeAdded() {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setAge(20);
        employeeDto.setName("Test");

        EmployeeDto employeeDtoTest = employeeService.create(employeeDto);

        assertEquals(StateEnum.ADDED, employeeDtoTest.getAccountState());
    }

    @Test
    public void whenUpdateEmployee_EmployeeState_ShouldBeChange() {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(1L);
        employeeDto.setAge(20);
        employeeDto.setName("Test");
        employeeDto.setAccountState(StateEnum.IN_CHECK);

        EmployeeDto employeeDtoTest = employeeService.update(employeeDto);

        assertEquals(StateEnum.IN_CHECK, employeeDtoTest.getAccountState());
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenUpdateEmployee_WithoutId_ShouldThrowException() {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setAge(20);
        employeeDto.setName("Test");
        employeeDto.setAccountState(StateEnum.IN_CHECK);

        employeeService.update(employeeDto);
    }
}
