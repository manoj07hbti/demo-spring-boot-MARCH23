package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {
    @RequestMapping("/facto/{n}")
    public long FindFactorial(@PathVariable long n){
        if (n==1)
        {
             return 1;
        }else return n*FindFactorial(n-1);
    }
}
