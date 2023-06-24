package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmstrongNumber_PathVariable {
    @RequestMapping("/armstrong/{number}")
    public String armstrong(@PathVariable int number){
        int arm=0,reminder,a;
        a=number;
        while (number>0){
            reminder= number%10;
            arm=reminder*reminder*reminder+arm;
            number=number/10;
        }
        if (a==arm){
            return "the number"+a+"armstrong number";
        } else{
            return "the number"+a+"no armstrong number";
            
        }
    }


}
