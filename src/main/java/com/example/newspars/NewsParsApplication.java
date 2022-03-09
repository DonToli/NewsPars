package com.example.newspars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NewsParsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsParsApplication.class, args);
    }

}
