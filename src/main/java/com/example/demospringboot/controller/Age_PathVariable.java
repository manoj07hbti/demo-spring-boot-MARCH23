package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Age_PathVariable {
    @RequestMapping("/age/{age}")
    public String age(@PathVariable int age ){
        if (age>=0 && age<=14){
            return "CHILD";
        }else if (age>14 && age<=43){
            return "YOUNG";
        } else if (age>43 && age<=55){
            return "MIDDLE ADULT";
        } else if (age>55){
            return "OLDEST";
        }else{
            return "AGE GREATER THAN 0";

        }
    }
}
