package com.example.demospringboot.controller.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_RequestParam {
    @RequestMapping("/add")
    public String add(@RequestParam int a,@RequestParam int b){
        int c=a+b;
        return "THE ADDITION OF "+a +" AND "+b+" : "+c;
    }
    @RequestMapping("/multiply")
    public String multiplication(@RequestParam int a,@RequestParam int b){
        int c=a*b;
        return "THE multiplication OF "+a +" AND "+b+" : "+c;
    }
    @RequestMapping("/subtract")
    public String subtraction(@RequestParam int a,@RequestParam int b){
        int c=a-b;
        return "THE subtraction OF "+a +" AND "+b+" : "+c;
    }
    @RequestMapping("/divide")
    public String division(@RequestParam int a,@RequestParam int b){
        double c=(double)a/b;
        return "THE division OF "+a +" AND "+b+" : "+c;
    }
}
