package com.xiaoyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springsession.config.EnableZtevSpringSession;

@SpringBootApplication
@EnableZtevSpringSession
public class Application {
    // 自动配置Spring框架
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}