package com.example.webshopchicnchoc.service;

import com.example.webshopchicnchoc.entity.User;
import com.example.webshopchicnchoc.repository.UserRepository;
import com.example.webshopchicnchoc.entity.User;
import com.example.webshopchicnchoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    //post user
    public User saveUser(User user) {
        return repository.save(user);
    }

    //get user
    public List<User> getUsers() {
        return repository.findAll();
    }

    public User getUserById (int id) {
        return repository.findById(id).orElse(null);
    }

    //delete user
    public String deleteUser(int id) {
        repository.deleteById(id);

        return "User deleted" + id;
    }

    //update user
    public User updateUser(User user) {
        User existingUser=repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setLastname(user.getLastname());

        return repository.save(existingUser);
    }
}