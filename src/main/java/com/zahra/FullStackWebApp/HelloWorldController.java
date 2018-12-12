package com.zahra.FullStackWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Controller //a class that holds routes
public class HelloWorldController  {

    @RequestMapping("/")
    public RedirectView homeRedirect() {
        return new RedirectView("/albums");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET) //we are explicitly saying its a get, we can change to post
    public String helloworld(){
        return "Hello world";
        //herokudeployment requires the /hello
    }

    @RequestMapping(value = "/capitalize/{wordsToCapitalize}", method = RequestMethod.GET)
    public String capitalizeWords(@PathVariable()String wordsToCapitalize){

        return wordsToCapitalize(wordsToCapitalize);
        //leaf passes the string all the way to the front end
    }

    public static String  wordsToCapitalize(String wordsToCapitalize){

        return wordsToCapitalize.toUpperCase();

    }
}
