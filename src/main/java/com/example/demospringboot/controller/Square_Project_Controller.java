package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Square_Project_Controller {

    @RequestMapping("/square")
    public String numberSquare(){
        int a=8;
        int square=a*a;
        return "Square of given Number is:- "+square;
    }
    }

