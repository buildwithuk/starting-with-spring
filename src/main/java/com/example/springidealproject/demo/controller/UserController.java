package com.example.springidealproject.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springidealproject.demo.dao.UserRepository;
import com.example.springidealproject.demo.domain.User;

@RestController()
@RequestMapping("/users")
public class UserController {
    
    private UserRepository userRepository;

    // BecuaseI dont like the autowire way
    public UserController(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {

        return this.userRepository.getUsers();

    }
}
