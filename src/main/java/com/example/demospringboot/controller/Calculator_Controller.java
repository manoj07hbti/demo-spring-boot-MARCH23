package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Controller {
    @RequestMapping("/add")
    public String addition(){

        int a=10;
        int b=40;
        int result = a+b;
        return "sum of a & b is :-"+result;
    }
    @RequestMapping("/sub")
    public String subtraction() {
        int a = 150;
        int b = 70;
        int result = a - b;
        return "sub of a & b is :-" + result;
    }
        @RequestMapping("/multi")
    public String multiplication() {
            int a = 9;
            int b = 8;
            int result = a * b;
            return "multi of a & b is :-" + result;
        }
        @RequestMapping("/divide")
    public String divide() {
            int a = 80;
            int b = 10;
            int result = a / b;
            return "divide of a & b is :-" + result;
        }
        @RequestMapping("/ percent")
    public String percent(){
        double a = 225;
        double b = 15;
        double result =a*b/100;
        return "percent of a & b is :-"+result;



    }
}
