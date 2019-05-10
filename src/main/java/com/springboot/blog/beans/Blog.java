package com.springboot.blog.beans;

import java.math.BigDecimal;
import java.util.Date;

public class Blog {
    private Integer blogId;

    private String blogTitle;

    private Date blogCreatTime;

    private BigDecimal blogEarnings;

    private Integer blogFavotimes;

    private Integer blogShowtimes;

    private Integer userId;

    private Integer typeId;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public Date getBlogCreatTime() {
        return blogCreatTime;
    }

    public void setBlogCreatTime(Date blogCreatTime) {
        this.blogCreatTime = blogCreatTime;
    }

    public BigDecimal getBlogEarnings() {
        return blogEarnings;
    }

    public void setBlogEarnings(BigDecimal blogEarnings) {
        this.blogEarnings = blogEarnings;
    }

    public Integer getBlogFavotimes() {
        return blogFavotimes;
    }

    public void setBlogFavotimes(Integer blogFavotimes) {
        this.blogFavotimes = blogFavotimes;
    }

    public Integer getBlogShowtimes() {
        return blogShowtimes;
    }

    public void setBlogShowtimes(Integer blogShowtimes) {
        this.blogShowtimes = blogShowtimes;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}