package com.springboot.blog.beans;

import java.util.Date;

public class Message {
    private Integer messId;

    private String messCont;

    private Date messCreatTime;

    private Integer blogId;

    private Integer userId;

    public Integer getMessId() {
        return messId;
    }

    public void setMessId(Integer messId) {
        this.messId = messId;
    }

    public String getMessCont() {
        return messCont;
    }

    public void setMessCont(String messCont) {
        this.messCont = messCont == null ? null : messCont.trim();
    }

    public Date getMessCreatTime() {
        return messCreatTime;
    }

    public void setMessCreatTime(Date messCreatTime) {
        this.messCreatTime = messCreatTime;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}