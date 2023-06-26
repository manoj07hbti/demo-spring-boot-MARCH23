package com.example.demospringboot.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Age_PathVariable_Project {
    @RequestMapping("/ageChecking/{age}")
    public String ageChecking(@PathVariable int age) {

        if (age>=10 && age<=15){
            return " Person is Child";
        }
        if (age>=16 && age<=25) {
            return "Person isYoung";
        }
        if (age>=45 && age<70) {
            return " Person is Old";
        }
        return "Age status is:- "+age;
    }
}
