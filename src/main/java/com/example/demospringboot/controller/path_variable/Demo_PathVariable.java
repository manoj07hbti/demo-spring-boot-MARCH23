package com.example.demospringboot.controller.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_PathVariable {

    @RequestMapping("/even_odd/{number}")
    public String evenodd(@PathVariable int number){
        if(number%2==0){
            return number +" is even number ";
        }else{
            return number +" is odd number ";
        }
    }

    @RequestMapping("/welcome/{name}")
    public String welcome(@PathVariable String name){
        return "WELCOME TO SPRING BOOT "+name;
    }

    @RequestMapping("/voting/{age}/{city}")
    public String votingapp(@PathVariable int age,@PathVariable String city){
        if(age>=18 && city.equals("delhi")){
            return "ELIGIBLE FOR VOTING";
        }else{
            return "NOT ELIGIBLE FOR VOTING";
        }
    }
}
