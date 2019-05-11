package com.springboot.blog.imapper;

import com.springboot.blog.beans.Favorites;

public interface FavoritesMapper {
    int deleteByPrimaryKey(Integer favoId);

    int insert(Favorites record);

    int insertSelective(Favorites record);

    Favorites selectByPrimaryKey(Integer favoId);

    int updateByPrimaryKeySelective(Favorites record);

    int updateByPrimaryKey(Favorites record);
}