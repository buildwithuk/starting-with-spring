package com.example.springidealproject.demo.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springidealproject.demo.dao.UserRepository;

public abstract class BaseService {
    
    @Autowired
    public UserRepository userRepository;

}
