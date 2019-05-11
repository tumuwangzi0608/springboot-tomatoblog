package com.springboot.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan(basePackages = "com.springboot.blog.imapper")

public class TomatoBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomatoBlogApplication.class, args);
    }

}
