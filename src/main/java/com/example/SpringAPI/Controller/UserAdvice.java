package com.example.SpringAPI.Controller;

import com.example.SpringAPI.Service.UserBadRequestException;
import com.example.SpringAPI.Service.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserAdvice {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String notFoundHandler(UserNotFoundException ex) {
        return ex.getMessage();
    }
    @ExceptionHandler(UserBadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String badRequestHandler(UserBadRequestException ex) {
        return ex.getMessage();
    }
}