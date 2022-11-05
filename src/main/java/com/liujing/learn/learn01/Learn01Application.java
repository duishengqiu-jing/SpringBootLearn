package com.liujing.learn.learn01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liujing.learn.learn01.mapper")
public class Learn01Application {

    public static void main(String[] args) {
        SpringApplication.run(Learn01Application.class, args);
    }

}
