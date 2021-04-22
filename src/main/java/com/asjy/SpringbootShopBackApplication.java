package com.asjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//springboot启动注解
@SpringBootApplication
//相当给dao下所有的接口，都加了@mapper注解
@MapperScan("com.asjy.dao")
public class SpringbootShopBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShopBackApplication.class, args);
    }

}
