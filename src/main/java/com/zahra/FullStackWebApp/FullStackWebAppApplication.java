package com.zahra.FullStackWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FullStackWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullStackWebAppApplication.class);

        System.out.println("http://localhost:8080/hello");
        System.out.println("http://localhost:8080/capitalize/this%20should%20be%20in%20all%20caps");
        System.out.println("http://localhost:8080/albums");


    }
}

