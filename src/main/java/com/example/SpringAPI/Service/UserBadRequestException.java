package com.example.SpringAPI.Service;

public class UserBadRequestException extends RuntimeException{
    public UserBadRequestException() {
        super("Bad request");
    }
}
