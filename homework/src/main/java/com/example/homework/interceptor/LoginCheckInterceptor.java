package com.example.homework.interceptor;


import com.alibaba.fastjson.JSONObject;
import com.example.homework.Utils.JwtUtils;
import com.example.homework.pojo.Result;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Slf4j
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    
    
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
        
        String url = req.getRequestURI();
        log.info("请求路径 - interceptor：{}", url);
        
        // 获得请求头中的token
        String jwt = req.getHeader("token");
        log.info("请求头中的token - interceptor：{}", jwt);
        
        // 判断是否有token
        if (!StringUtils.hasLength(jwt)) {
            // 没有token，返回错误信息
            returnError(resp);
            return false;
        }
        
        // 解析token
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            // 解析失败，返回错误信息
            returnError(resp);
            return false;
        }
        
        return true;
    }
    
    
    
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行后");
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("渲染后");
    }
    
    
    
    
    
    
    private void returnError(HttpServletResponse resp) throws IOException {
        Result error = Result.error("NOT_LOGIN");
        // 将错误信息以对象形式转化为JSON字符串
        String notLogin = JSONObject.toJSONString(error);
        // 将JSON字符串写入响应体
        resp.getWriter().write(notLogin);
    }
    
    
    
    
}
