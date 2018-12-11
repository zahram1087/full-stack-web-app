package com.zahra.FullStackWebApp;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController //a class that holds routes
public class HelloWorldController  {

    @RequestMapping(value = "/hello", method = RequestMethod.GET) //we are explicitly saying its a get, we can change to post
    public String helloworld(){
        return "Hello world";
    }

    @RequestMapping(value = "/capitalize/{wordsToCapitalize}", method = RequestMethod.GET)
    public String capitalizeWords(@PathVariable()String wordsToCapitalize, Model model){

        model.addAttribute("wordsToCapitalize",wordsToCapitalize);
        return wordsToCapitalize(wordsToCapitalize);
        //leaf passes the string all the way to the front end
    }

    public static String  wordsToCapitalize(String wordsToCapitalize){

        return wordsToCapitalize.toUpperCase();

    }
}
