package com.zahra.FullStackWebApp;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void testwordsToCapitalizeShort() {

        String word = "hello";
        String expected = "HELLO";
        String actual = HelloWorldController.wordsToCapitalize(word);
        assertEquals(expected,actual);
    }

    @Test
    public void testwordsToCapitalizeMedium() {

        String word = "helloThere";
        String  expected= "HELLOTHERE";
        String actual = HelloWorldController.wordsToCapitalize(word);
        assertEquals(expected,actual);
    }

    @Test
    public void testwordsToCapitalizeLarge() {

        String word = "helloTherewhereHow";
        String expected= "HELLOTHEREWHEREHOW";
        String actual = HelloWorldController.wordsToCapitalize(word);
        assertEquals(expected,actual);
    }
}