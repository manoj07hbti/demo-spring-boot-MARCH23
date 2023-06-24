package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @RequestMapping("/status/{age}")
    public String pesonstatus(@PathVariable int age){
        if (age<18){
            return "The candidate is child and his/her age is :"+age;
        } else if (age>=18 & age<60) {
            return "The candidate is young and his/her age is :"+age;
        }else
            return"The candidate is Old and his/her age is :"+age;
    }
}
