package com.example.demo.dto;

import lombok.Data;

import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class BaseDto {
    private Long id;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;
}
