package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Spring_Boot {
    @RequestMapping("/Addition")
    public String Add(){
        int a=76;
        int b=65;
        int sum= a+b;
        return "Add number:- "+sum;

    }
    @RequestMapping("/Sub")
    public String Sub(){
        int a=90;
        int b=56;
        int sub= a-b;
        return "Sub Number:- "+sub;

    }
    @RequestMapping("/Mul")
    public String Mul(){
        int a=56;
        int b=87;
        int mul= a*b;
        return "Mul Number:- "+mul;

    }
    @RequestMapping("/Divide")
    public String Div(){
        int a=56;
        int b=76;
        int div= b/a;
        return "Div Number:- "+div;
    }
    @RequestMapping("/Percentage")
    public String Percentage(){
        int a=90;
        int b=87;
        int per=a*b/100;
        return "Percentage NUmber:- "+per;

    }
}
