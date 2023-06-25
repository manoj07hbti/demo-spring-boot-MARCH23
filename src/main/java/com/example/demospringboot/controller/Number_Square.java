package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Number_Square {

    @RequestMapping("/square")
    public String MakeSquare() {

        int number=8;
        int result=number*number;
        return "square of number is :"+result;
    }

}
