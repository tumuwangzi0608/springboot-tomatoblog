package com.springboot.blog.controller;

import com.springboot.blog.beans.User;
import com.springboot.blog.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    IUserService userService;


    @RequestMapping("/showalluser")
    @ResponseBody
    public List<User> showAllUser(){
        return userService.selectAllUser();
    }
}
