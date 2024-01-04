package com.github.northinrtm.msocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MsocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsocialApplication.class, args);
    }
}