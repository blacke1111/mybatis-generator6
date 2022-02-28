package com.study.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.study.docker.mapper")
public class DockerBoot {
    public static void main(String[] args) {
        SpringApplication.run(DockerBoot.class,args);
    }
}
