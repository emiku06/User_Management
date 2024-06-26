package com.example.SpringAPI.Service;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(int id) {
        super("Could not find user " + id);
    }
    public UserNotFoundException() {
        super("No users");
    }
}
