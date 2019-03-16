package com.itea;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itea.mapper")
public class MybatisThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisThymeleafApplication.class, args);
    }

}
