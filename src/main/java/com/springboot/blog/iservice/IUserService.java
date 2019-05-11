package com.springboot.blog.iservice;


import com.springboot.blog.beans.User;

import java.util.List;

public interface IUserService {
    List<User> selectAllUser();
}
