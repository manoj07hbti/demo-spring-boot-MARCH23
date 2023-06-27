package com.example.demospringboot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculatorRequestParam {

    @RequestMapping("/square")
    public String makesquare(@RequestParam int number ){
        int result=number*number;
        return "square of number is :" + result;
    }

    @RequestMapping("/addition")
    public String addition(@RequestParam int a,@RequestParam int b){
        int result=a+b;
        return "sum of a & b is :"+result;
    }

    @RequestMapping("/subtract")
    public String substraction(@RequestParam int a,@RequestParam int b){
        int result=a-b;
        return "subtraction from a to b is :"+result;
    }

    @RequestMapping("/multip")
    public String multiplication(@RequestParam int a,@RequestParam int b){
        int result=a*b;
        return "multiplication of a and b is :"+result;
    }

    @RequestMapping("/divis")
    public String division(@RequestParam int a,@RequestParam int b){
        int result=a/b;
        return "division of a by b is :"+result;
    }

    @RequestMapping("/perc")
    public String percent(@RequestParam int a,@RequestParam int b){
        double result=a*b/100;
        return "percentage is :"+result;
    }

}
