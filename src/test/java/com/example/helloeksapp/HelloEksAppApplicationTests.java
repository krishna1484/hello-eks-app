package com.example.helloeksapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class HelloEksAppApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(HelloEksAppApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("Running the only one test case");
        Assertions.assertEquals("Rama","Rama");
    }

}
