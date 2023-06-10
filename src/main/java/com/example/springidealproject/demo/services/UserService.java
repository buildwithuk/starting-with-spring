package com.example.springidealproject.demo.services;

import java.util.List;

import com.example.springidealproject.demo.common.BaseService;
import com.example.springidealproject.demo.domain.User;

public class UserService extends BaseService {
    
    public List<User> getUsers() {

        return userRepository.getUsers();
    }


}
