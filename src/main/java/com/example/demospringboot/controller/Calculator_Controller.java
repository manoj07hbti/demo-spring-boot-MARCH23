package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Controller {

    @RequestMapping("/addition")
    public String add(){
        int a=50;
        int b=60;
        int c=a+b;
        return "the addition of 50 and 60 is : "+c;
    }

    @RequestMapping("/subtraction")
    public String sub(){
        int a=50;
        int b=60;
        int c=a-b;
        return "the subtraction of 50 and 60 is : "+c;
    }

    @RequestMapping("/multiplication")
    public String multi(){
        int a=50;
        int b=60;
        int c=a*b;
        return "the multiplication of 50 and 60 is : "+c;
    }

    @RequestMapping("/division")
    public String division(){
        int a=50;
        int b=60;
        double c=(double)a/b;
        return "the division of 50 and 60 is : "+c;
    }
}
