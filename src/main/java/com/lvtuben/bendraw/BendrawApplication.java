package com.lvtuben.bendraw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lvtuben.bendraw.mapper")
@SpringBootApplication
public class BendrawApplication {

    public static void main(String[] args) {
        SpringApplication.run(BendrawApplication.class, args);
    }

}
