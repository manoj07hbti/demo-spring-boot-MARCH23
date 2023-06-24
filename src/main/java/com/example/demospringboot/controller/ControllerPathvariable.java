package com.example.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPathvariable {

    @RequestMapping("/squareofnum/{number}")
    public String makesquare(@PathVariable int number ){
        int result=number*number;
        return "square of number is :" + result;

    }

    @RequestMapping("/sum/{a}/{b}")
    public String addition(@PathVariable int a,@PathVariable int b){
        int result=a+b;
        return "sum of a & b is :"+result;
    }

    @RequestMapping("/subtraction/{a}/{b}")
    public String substraction(@PathVariable int a,@PathVariable int b){
        int result=a-b;
        return "subtraction from a to b is :"+result;
    }

    @RequestMapping("/multi/{a}/{b}")
    public String multiplication(@PathVariable int a,@PathVariable int b){
        int result=a*b;
        return "multiplication of a and b is :"+result;
    }

    @RequestMapping("/divi/{a}/{b}")
    public String division(@PathVariable int a,@PathVariable int b){
        int result=a/b;
        return "division of a by b is :"+result;
    }

    @RequestMapping("/percentage/{a}/{b}")
    public String percent(@PathVariable int a,@PathVariable int b){
        double result=a*b/100;
        return "percentage is :"+result;
    }

}
