package com.example.webshopchicnchoc.controller;

import com.example.webshopchicnchoc.entity.User;
import com.example.webshopchicnchoc.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("api/")
@RestController
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping("/post")
    public User addUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    //Get user
    @GetMapping("/users")
    public List<User> getUsers() {
        return service.getUsers();
    }

    //Get users
    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }
}