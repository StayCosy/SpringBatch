package com.cosy.spring.batch.demo.controller;

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
    @RequestMapping("/init")
    public String init() {
        return "Init Ok!";
    }
}
