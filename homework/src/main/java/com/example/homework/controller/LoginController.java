package com.example.homework.controller;


import com.example.homework.Utils.JwtUtils;
import com.example.homework.pojo.Result;
import com.example.homework.pojo.User;
import com.example.homework.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    
    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        
        User u = loginService.login(user);
        if(u != null){
            Map<String, Object> claims = new HashMap<>();
            claims.put("username", u.getUsername());
            claims.put("password", u.getPassword());
            
            String jwt = JwtUtils.generateJwt(claims); //jwt包含了当前登录的员工信息
            
            return Result.success(jwt);
        }
        
        log.info("登录失败: {}", user);
        return Result.error("账号或密码错误");
    }
    
    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("/register")
    public Result insert(@RequestBody User user) {
        try{
            loginService.insert(user);
        }catch (Exception e){
            return Result.error("用户名已存在");
        }
        return Result.success();
    }
    
    /**
     * 按username查询
     * @param username
     * @return
     */
    @GetMapping("/login/{username}")
    public Result selectById(@PathVariable String username) {
        User u = loginService.selectById(username);
        if(u != null){
            log.info("查询成功: {}", u);
            return Result.success(u);
        }
        
        log.info("查询失败: {}", username);
        return Result.error("账号不存在");
    }
    
    /**
     * 修改密码
     * @param user
     * @return
     */
    @PutMapping("/login")
    public Result Update(@RequestBody User user) {
        loginService.update(user);
        return Result.success();
    }
    
    /**
     * 删除用户
     * @param username
     * @return
     */
    @DeleteMapping("/login/{username}")
    public Result delete(@PathVariable String username) {
        loginService.delete(username);
        return Result.success();
    }
    
    /**
     * 查询所有用户
     */
    @GetMapping("/dashboard")
    public Result selectAll() {
        List<User> u = loginService.selectAll();
        return Result.success(u);
    }
    
    /**
     * 返回null
     */
    @PostMapping("/dashboard")
    public Result JustReturn(){
        return Result.error();
    }
}
