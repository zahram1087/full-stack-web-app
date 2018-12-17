package com.zahra.FullStackWebApp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FullStackWebAppApplicationTest {
    @LocalServerPort
    private int port;
    @Autowired
    HelloWorldController controller;

    @Test
    public void contextLoad() throws Exception{
        assertThat(controller).isNotNull();
    }
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:" +port+ "/hello",String.class)).contains("Hello world");
    }

    @Test
    public void shouldReturnCapitalizedMessage() throws Exception{
        assertThat(this.restTemplate.getForObject("http://localhost:" +port+ "/capitalize/this",String.class)).contains("THIS");
    }


}