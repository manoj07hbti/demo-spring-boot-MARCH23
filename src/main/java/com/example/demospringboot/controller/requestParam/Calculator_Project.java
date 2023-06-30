package com.example.demospringboot.controller.requestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Project {
    @RequestMapping("/calAddition")
    public String calAddition(@RequestParam int a, @RequestParam int b){
        int sum;
        sum=a+b;
        return "Addition of given number is"+ sum;
    }
}
