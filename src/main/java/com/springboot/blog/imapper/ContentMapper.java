package com.springboot.blog.imapper;

import com.springboot.blog.beans.Content;

public interface ContentMapper {
    int deleteByPrimaryKey(Integer conId);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer conId);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);
}