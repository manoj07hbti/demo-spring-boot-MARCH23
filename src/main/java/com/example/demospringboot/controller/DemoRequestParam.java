package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRequestParam {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam String name){

        return "Hello "+name+ " Welcome to Path variable demo..";
    }

    @RequestMapping("/greeting/{message}")
    public String greetingAdvance(@RequestParam String name, @PathVariable String message){

        return "Hello "+name+ " Welcome to Path variable demo.."+message;
    }

    @RequestMapping("/vote")
    public String voting(@RequestParam String city,@RequestParam int age){

        if(age>=18 && city.equalsIgnoreCase("Agra")){

            return "Person is eligible for voting in Agra...";
        }else {
            return "Person NOT is eligible for voting in Agra...";
        }
    }
}
