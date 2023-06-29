package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParam_Calculator {

    @RequestMapping("/Add")
    public String addition(@RequestParam int a, @RequestParam int b ){
         int d = a+b;
         return "the addition of "+ a +"and"+ b +":"+ d;
    }

    @RequestMapping("/sub")
    public String subtraction (@RequestParam int a, @RequestParam int b ){
        int d = a-b;
        return "the subtraction of "+ a +"and"+ b +":"+ d;
    }

    @RequestMapping("/multi")
    public String multiplication (@RequestParam int a, @RequestParam int b ){
        int d = a*b;
        return "the multiplication of "+ a +"and"+ b +":"+ d;
    }

    @RequestMapping("/div")
    public String divide (@RequestParam int a, @RequestParam int b ){
        double d = a/b;
        return "the divide of "+ a +"and"+ b +":"+ d;
    }

    @RequestMapping("/per")
    public String percent (@RequestParam int a, @RequestParam int b ){
        int d = a*b/100;
        return "the percent of "+ a +"and"+ b +":"+ d;
    }

}
