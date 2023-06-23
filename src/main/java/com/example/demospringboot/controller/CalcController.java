package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;

@RestController
public class CalcController {
    @RequestMapping("/square")
    public String makesquare(){
        int number=5;
        int result=number*number;
        return "square of number is :" + result;

    }
    @RequestMapping("/add")
    public String addition(){
        int a=10;
        int b=50;
        int result=a+b;
        return "sum of a & b is :"+result;
    }
    @RequestMapping("/sub")
    public String substraction(){
        int a=100;
        int b=40;
        int result=a-b;
        return "subtraction from a to b is :"+result;
    }
    @RequestMapping("/mult")
    public String multiplication(){
        int a=100;
        int b=50;
        int result=a*b;
        return "multiplication of a and b is :"+result;
    }
    @RequestMapping("/div")
    public String division(){
        int a=400;
        int b=50;
        int result=a/b;
        return "division of a by b is :"+result;
    }
    @RequestMapping("/percent")
    public String percent(){
        double a=445;
        double b=20 ;// in percent
        double result=a*b/100;
        return "percentage of a 20 % is :"+result;
    }


}
