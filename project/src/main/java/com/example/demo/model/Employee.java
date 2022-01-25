package com.example.demo.model;

import com.example.demo.enums.StateEnum;
import lombok.*;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "account_state")
    private StateEnum accountState;
}
