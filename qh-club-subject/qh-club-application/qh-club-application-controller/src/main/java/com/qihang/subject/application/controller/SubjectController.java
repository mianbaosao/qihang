package com.qihang.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 刷题算法层
 * @Author:bread
 * @Date: 2024-07-25 17:16
 */
@RestController
public class SubjectController {

    @GetMapping("/test")
    public String test(){
        return "hello world!";
    }
}
