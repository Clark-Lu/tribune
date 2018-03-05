package com.changlu.tribune;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.changlu.tribune")
@MapperScan(basePackages = "com.changlu.tribune.mapper")
public class Startup {
    public static void main(String[] args){
        SpringApplication.run(Startup.class,args);
    }
}
