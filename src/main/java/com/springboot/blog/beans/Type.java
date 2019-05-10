package com.springboot.blog.beans;

import java.util.Date;

public class Type {
    private Integer typeId;

    private String typeCont;

    private Date typeCreatTime;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeCont() {
        return typeCont;
    }

    public void setTypeCont(String typeCont) {
        this.typeCont = typeCont == null ? null : typeCont.trim();
    }

    public Date getTypeCreatTime() {
        return typeCreatTime;
    }

    public void setTypeCreatTime(Date typeCreatTime) {
        this.typeCreatTime = typeCreatTime;
    }
}