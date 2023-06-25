package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPathVariable{

    @RequestMapping("/even_odd/{number}")
    public String evenOdd(@PathVariable int number){

        if(number%2==0){

            return "Number is Even number "+number;
        }else {

            return "Number is Odd number "+number;
        }

    }
    @RequestMapping("/welcome/{name}")
    public String welcome(@PathVariable String name){

        return "Welcome to Spring Boot :"+name;
    }
    @RequestMapping("/voting/{age}/{city}")
    public String voting(@PathVariable int age,@PathVariable String city){

        if(age>=18 && city.equals("Agra")){
            return "Eligible for voting in Agra ...";
        }else {
            return "NOT Eligible for voting in Agra ...";
        }

    }

}
