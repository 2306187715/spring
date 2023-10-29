package com.example.homework.service;

import com.example.homework.pojo.User;

import java.util.List;

public interface LoginService {
    User login(User user);
    
    void insert(User user);
    
    User selectById(String username);
    
    void update(User user);
    
    void delete(String username);
    
    List<User> selectAll();
    
}
