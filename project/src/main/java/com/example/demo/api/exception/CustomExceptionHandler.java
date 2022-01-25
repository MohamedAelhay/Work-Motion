package com.example.demo.api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;

import static com.example.demo.api.response.ApiResponseHelper.BadRequestApiResponse;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler
    public ResponseEntity handleException(IllegalArgumentException exception) {
        return BadRequestApiResponse(exception.getMessage(), Collections.singletonList(exception.getLocalizedMessage()));
    }
}
