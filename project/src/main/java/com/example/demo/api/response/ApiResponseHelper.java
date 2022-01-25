package com.example.demo.api.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ApiResponseHelper {
    public static <T> ResponseEntity OKApiResponse(T data) {
        return new ResponseEntity(new ApiResponse(HttpStatus.OK, "Operation was successful", data), HttpStatus.OK);
    }

    public static ResponseEntity BadRequestApiResponse(String message, List<String> errors) {
        return new ResponseEntity(new ApiResponse(HttpStatus.BAD_REQUEST, message, errors), HttpStatus.BAD_REQUEST);
    }
}
