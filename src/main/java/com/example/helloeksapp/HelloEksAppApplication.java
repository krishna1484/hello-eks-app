package com.example.helloeksapp;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloEksAppApplication {

    @PostConstruct
    public void init(){
      log.info("application started");
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloEksAppApplication.class, args);
    }

}
