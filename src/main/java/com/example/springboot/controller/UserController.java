package com.example.springboot.controller;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
