package com.springboot.blog.beans;

public class Favorites {
    private Integer favoId;

    private Integer userId;

    private Integer blogId;

    public Integer getFavoId() {
        return favoId;
    }

    public void setFavoId(Integer favoId) {
        this.favoId = favoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }
}