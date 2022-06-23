package com.springboot.springdemoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticController {
    @RequestMapping("/addition")
    public String addition(){
        int a=2,b=3;
        return ("Addition of "+a+" & "+b+ " = "+ (a+b));
    }

    @RequestMapping("/multiplication")
    public String multiplication(){
        int a=2,b=3;
        return ("Multiplication of "+a+" & "+b+ " = "+ (a*b));
    }
}
