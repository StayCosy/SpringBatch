package com.cosy.spring.batch.demo.controller;

import com.cosy.spring.batch.demo.bean.ClassDependsBeanKey;
import com.cosy.spring.batch.demo.dao.ClassDependsBeanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Cosy
 * @Date: 18-7-25 下午1:48
 * @Description:
 * @Version:1.0
 */
@RestController
public class TestController {
    @Autowired
    ClassDependsBeanDao classDependsBeanDao;
    @RequestMapping("/init")
    public String init() {
        ClassDependsBeanKey classDependsBeanKey = new ClassDependsBeanKey();
        classDependsBeanKey.setAtIndx(1);
        classDependsBeanKey.setClassName("testDemo");
        ClassDependsBeanKey classDependsBean = classDependsBeanDao.selectByPrimaryKey(classDependsBeanKey);
        System.out.println(classDependsBean.getClassName());
        return "Init Ok!";
    }
}
