package com.cosy.spring.batch.demo.dao;

import com.cosy.spring.batch.demo.bean.ClassDependsBean;
import com.cosy.spring.batch.demo.bean.ClassDependsBeanKey;

public interface ClassDependsBeanDao {
    int deleteByPrimaryKey(ClassDependsBeanKey key);

    int insert(ClassDependsBean record);

    int insertSelective(ClassDependsBean record);

    ClassDependsBean selectByPrimaryKey(ClassDependsBeanKey key);

    int updateByPrimaryKeySelective(ClassDependsBean record);

    int updateByPrimaryKey(ClassDependsBean record);
}