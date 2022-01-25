package com.example.demo.api.response;

import com.example.demo.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private T data;
    private String message;
    private HttpStatus status;
    private List<String> errors;

    private String timeStamp
            = DateUtil.getTimeStamp();

    public ApiResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public ApiResponse(HttpStatus status, String message, T data) {
        this.data = data;
        this.status = status;
        this.message = message;
    }

    public ApiResponse(HttpStatus status, String message, List<String> errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }
}
