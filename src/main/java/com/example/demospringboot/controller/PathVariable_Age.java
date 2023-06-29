package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PathVariable_Age {
    @RequestMapping("/age/{age}")
    public String AgeFinder (@PathVariable int age){
        if (age>=0 && age<=15) {
            return "the person is child";

        }else if (age>15 &&  age<40) {
            return "the person is young ";

        }else if (age>40 && age <50) {
            return "the person is old ";

        }else {
            return "age must be above 0 ";




        }
    }

}
