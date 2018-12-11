package com.zahra.FullStackWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //a class that holds routes
public class HelloWorldController {
    @RequestMapping("/hello") //get method is default
    public String helloworld(){
        return "Hello world";
        //herokudeployment requires the /hello
    }
}
