package com.example.springidealproject.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springidealproject.demo.domain.User;

@Repository
public class UserRepository {

    public List<User> getUsers() {

        return Arrays.asList(
                new User(1, "ABC", "abc@spring.com"),
                new User(1, "XZY", "xyz@spring.com"));

    }
}
