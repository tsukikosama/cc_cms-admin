package com.weilai.ccSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//开启定时任务
@EnableScheduling
//开启支持异步
@EnableAsync
public class CcSpringbootStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcSpringbootStartApplication.class, args);
    }

}
