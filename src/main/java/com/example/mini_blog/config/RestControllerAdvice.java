package com.example.mini_blog.config;
import com.example.mini_blog.error.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(EntityNotFoundException.class)
    ErrorDto methodArgumentNotValidExceptionHandler(EntityNotFoundException e) {
        ErrorDto dto = new ErrorDto();
        dto.setCode(HttpStatus.NOT_FOUND.value());
        dto.setMessage(e.getLocalizedMessage());
        return dto;
    }
}
