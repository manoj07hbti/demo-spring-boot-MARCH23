package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_PathVariable {
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        int add=a+b;
        return "The Addition a and b"+add;
    }
    @RequestMapping("/Sub/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){
        int sub=a-b;
        return "The subtraction a and b"+sub;
    }
    @RequestMapping("/Mul/{a}/{b}")
    public String Mul(@PathVariable int a,@PathVariable int b){
        int mul=a*b;
        return "The Multiply a and b"+mul;
    }
    @RequestMapping("/Div/{a}/{b]")
    public String Div(@PathVariable int a,@PathVariable int b){
        int div=a/b;
        return "The Divide a and b"+div;

    }

}
