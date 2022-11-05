package com.liujing.learn.learn01.controller;


import com.liujing.learn.learn01.entity.School;
import com.liujing.learn.learn01.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 学校 前端控制器
 * </p>
 *
 * @author liujing278
 * @since 2022-11-05
 */
@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("hello/{id}")
    public String helloSchool(@PathVariable("id") Integer id) {
        System.out.println("id:"+id);
        School school = schoolService.getById(id);
        System.out.println(school.getName());
        return school.getAddress();
    }

}
