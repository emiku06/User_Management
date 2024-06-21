package com.example.SpringAPI.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceFactory {
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
