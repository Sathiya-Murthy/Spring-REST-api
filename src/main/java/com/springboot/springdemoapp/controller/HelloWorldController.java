package com.springboot.springdemoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String HelloWorld(){
        return "Hello World";
    }
    @RequestMapping
    public String start(){
        return "Home";
    }
}
