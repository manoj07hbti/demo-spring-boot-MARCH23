package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Make the Calculator app project using Controller class in Spring Boot============================
@RestController
public class Calculator_Project {
    @RequestMapping("/addition")
    public String addition(){
        int a=12;
        int b=11;
        int sum= a+b;
        return "Addition of Number is:- "+sum;
    }
    @RequestMapping("/subtraction")
    public String subtraction(){
        int a=20;
        int b=12;
        int sub= a-b;
        return "Subtraction of Number is:- "+sub;
    }
    @RequestMapping("/multiply")
    public String multiply(){
        int a=16;
        int b=13;
        int mul= a*b;
        return "Multiply of Number is:- "+mul;
    }
    @RequestMapping("/divide")
    public String divide(){
        int a=120;
        int b=5;
        int div= a/b;
        return "Divide of Number is:- "+div;
    }
    @RequestMapping("/percentage")
    public String percentage(){
        int a=60;
        int b=80;
        int per= a*b/100;
        return "Percentage of Number is:- "+per;
    }
}
