package com.example.demospringboot.controller.requestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Project {
    @RequestMapping("/calAddition")
    public String calAddition(@RequestParam int a, @RequestParam int b) {
        int sum;
        sum = a + b;
        return "Addition of given number is " + sum;
    }

    @RequestMapping("/calSubtraction")
    public String calSubtraction(@RequestParam int a, @RequestParam int b) {
        int sub;
        sub = a - b;
        return "Subtraction of given Number is " + sub;
    }

    @RequestMapping("/calMultiply")
    public String calMultiply(@RequestParam int a, @RequestParam int b) {
        int mul;
        mul = a * b;
        return "Multiply of given Number is " + mul;
    }

    @RequestMapping("/calDivide")
    public String calDivide(@RequestParam int a, @RequestParam int b) {
        int div;
        div = a/b;
        return "Divide of given Number is " + div;
    }

    @RequestMapping("/calPercentage")
    public String calPercentage(@RequestParam int a, @RequestParam int b) {
        int per;
        per = a*b/100;
        return "Percentage of given Number is " + per;
    }
}