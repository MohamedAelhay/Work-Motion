package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.example.demo.enums.StateEnum;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends BaseDto {
    @NotNull(message = "can not be null or empty.")
    private String name;

    @NotNull(message = "can not be null or empty.")
    private Integer age;

    private StateEnum accountState;
}
