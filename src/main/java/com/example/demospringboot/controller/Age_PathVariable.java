package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Age_PathVariable {

    @RequestMapping("/age/{age}")
    public String agefinder(@PathVariable int age){
        if(age>=0 && age<=12){
            return "CHILD";
        }else if (age>12 && age<=40){
            return "YOUNG";
        }else if(age>40&&age<=50){
            return "MIDDLE AGE ADULT";
        }else if(age>50){
            return "OLD ADULT";
        }else{
            return "AGE SHOULD BE GREATER THAN 0";
        }
    }
}
