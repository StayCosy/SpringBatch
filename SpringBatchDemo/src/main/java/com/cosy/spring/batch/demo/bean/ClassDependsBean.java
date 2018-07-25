package com.cosy.spring.batch.demo.bean;

public class ClassDependsBean extends ClassDependsBeanKey {
    private String dependClass;

    private String author;

    private String timestamp;

    public String getDependClass() {
        return dependClass;
    }

    public void setDependClass(String dependClass) {
        this.dependClass = dependClass == null ? null : dependClass.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp == null ? null : timestamp.trim();
    }
}