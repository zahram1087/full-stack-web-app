package com.zahra.FullStackWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullStackWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackWebAppApplication.class, args);
		System.out.println("http://localhost:8080/hello");

        System.out.println("http://localhost:8080/capitalize/this%20should%20be%20in%20all%20caps");


		//Create a hello world route at /hello, and ensure that you can
        //  visit that route in your browser and see data come back

	}
}
