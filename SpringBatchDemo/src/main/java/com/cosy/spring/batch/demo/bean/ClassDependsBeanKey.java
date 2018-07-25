package com.cosy.spring.batch.demo.bean;

public class ClassDependsBeanKey {
    private Integer atIndx;

    private String className;

    public Integer getAtIndx() {
        return atIndx;
    }

    public void setAtIndx(Integer atIndx) {
        this.atIndx = atIndx;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}