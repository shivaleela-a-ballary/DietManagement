package com.leela.diet_mgmt.controller;

import com.leela.diet_mgmt.model.User;
import com.leela.diet_mgmt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return repo.save(user);
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return repo.findAll();
    }
}