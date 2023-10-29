package com.example.homework.mapper;

import com.example.homework.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {
    
    
    //select username,password from login where username='jtz' and  password='123456'
    @Select("select username, password from login where username=#{username} and password=#{password}")
    User getByUsernameAndPassword(User user);
    
    @Insert("insert into login(username,password) values(#{username},#{password})")
    void insert(User user);
    
    @Select("select username, password from login where username=#{username}")
    User selectById(String username);
    
    void update(User user);
    
    @Delete("delete from login where username=#{username}")
    void delete(String username);
    
    @Select("select username, password from login")
    List<User> selectAll();
    
}
