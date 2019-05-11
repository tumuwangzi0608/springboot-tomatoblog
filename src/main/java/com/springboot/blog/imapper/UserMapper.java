package com.springboot.blog.imapper;

import com.springboot.blog.beans.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


public interface UserMapper {

    List<User> selectAllUser();
}