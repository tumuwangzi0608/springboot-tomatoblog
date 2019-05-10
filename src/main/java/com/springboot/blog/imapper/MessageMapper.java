package com.springboot.blog.imapper;

import om.springboot.blog.beans.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer messId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer messId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}