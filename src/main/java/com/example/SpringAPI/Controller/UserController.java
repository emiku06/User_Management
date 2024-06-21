package com.example.SpringAPI.Controller;

import com.example.SpringAPI.Model.User;
import com.example.SpringAPI.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAll();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return userService.get(id);
    }
    @PostMapping("/users")
    public User createUser(@RequestBody @Valid User user){
        return userService.createUser(user);
    }
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id, @RequestBody @Valid User user){
        return userService.updateUser(id,user);
    }
    @DeleteMapping("/users/{id}")
    public User deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

}
