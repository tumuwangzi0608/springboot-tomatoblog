package com.springboot.blog.service;

import com.springboot.blog.beans.User;
import com.springboot.blog.imapper.UserMapper;
import com.springboot.blog.iservice.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
