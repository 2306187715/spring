package com.example.homework.service.impl;

import com.example.homework.mapper.LoginMapper;
import com.example.homework.pojo.User;
import com.example.homework.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
    
    @Autowired
    LoginMapper loginMapper;
    
    @Override
    public User login(User user) {
        return loginMapper.getByUsernameAndPassword(user);
    }
    
    @Override
    public void insert(User user) {
        loginMapper.insert(user);
        
    }
    
    @Override
    public User selectById(String username) {
        return loginMapper.selectById(username);
        
        
    }
    
    @Override
    public void update(User user) {
        loginMapper.update(user);
    }
    
    @Override
    public void delete(String username) {
        loginMapper.delete(username);
    }
    
    @Override
    public List<User> selectAll() {
        return loginMapper.selectAll();
    }
}
