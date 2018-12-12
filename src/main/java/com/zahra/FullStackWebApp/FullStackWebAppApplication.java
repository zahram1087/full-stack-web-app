package com.zahra.FullStackWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FullStackWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullStackWebAppApplication.class);
    }
}

