package com.qihang.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Description: 刷题服务启动类
 * @Author:bread
 * @Date: 2024-07-25 16:57
 */
@SpringBootApplication
@ComponentScan("com.qihang")
public class SubjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }
}
