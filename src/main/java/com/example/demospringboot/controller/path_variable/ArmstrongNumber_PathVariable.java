package com.example.demospringboot.controller.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmstrongNumber_PathVariable {
    @RequestMapping("/armstrong/{number}")
    public String armstrong(@PathVariable int number){
       int arm=0, reminder ,a;
       a=number;
        while(number>0){
            reminder = number%10; // 1
            arm = reminder*reminder*reminder+arm;
            number = number/10;
        }
        if(a==arm){
            return "THE NUMBER "+a +" IS AN ARMSTRONG NUMBER";
        }else{
            return "THE NUMBER "+a +" IS  NOT AN ARMSTRONG NUMBER";
        }
    }
}
