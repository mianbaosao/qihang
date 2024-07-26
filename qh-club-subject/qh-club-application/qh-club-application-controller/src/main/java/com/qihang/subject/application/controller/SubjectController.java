package com.qihang.subject.application.controller;

import com.qihang.subject.infrastructure.basic.entity.SubjectCategory;
import com.qihang.subject.infrastructure.basic.service.SubjectCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 刷题算法层
 * @Author:bread
 * @Date: 2024-07-25 17:16
 */
@RestController
public class SubjectController {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("/test")
    public String test(){
        SubjectCategory subjectCategory=subjectCategoryService.queryById(1L);
        return  subjectCategory.getCategoryName();
    }
}
