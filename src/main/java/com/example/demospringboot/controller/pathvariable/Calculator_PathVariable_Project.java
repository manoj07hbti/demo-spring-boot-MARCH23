package com.example.demospringboot.controller.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_PathVariable_Project {
    @RequestMapping("calc_addition/{a}/{b}")
    public String calc_addition(@PathVariable int a,@PathVariable int b ){
        int sum=a+b;
        return "Addition of given number is :- "+sum;
    }

    @RequestMapping("calc_subtraction/{a}/{b}")
    public String calc_subtraction(@PathVariable int a,@PathVariable int b ){
        int sub=a-b;
        return "Subtraction of given number is :- "+sub;
    }
    @RequestMapping("calc_multiply/{a}/{b}")
    public String calc_multiply(@PathVariable int a,@PathVariable int b ){
        int mul=a*b;
        return "Multiply of given number is :- "+mul;
    }
    @RequestMapping("calc_divide/{a}/{b}")
    public String calc_divide(@PathVariable int a,@PathVariable int b ){
        int div=a/b;
        return "Divide of given number is :- "+div;
    }
}
