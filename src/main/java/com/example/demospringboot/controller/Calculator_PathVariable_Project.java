package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_PathVariable_Project {
    @RequestMapping("calculator{a,b}")
    public String calculator(@PathVariable int a,@PathVariable int b){
        int addition;
        addition=a+b;
        return "Addition of given number is :- "+addition;
    }
}
