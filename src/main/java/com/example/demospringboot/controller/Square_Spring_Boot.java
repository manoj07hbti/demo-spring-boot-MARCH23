package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Square_Spring_Boot {
    @RequestMapping("/Square")
    public String square(){
        int a=8;
        int square=a*a;
        return "square NUmber:- "+square;

    }
}
