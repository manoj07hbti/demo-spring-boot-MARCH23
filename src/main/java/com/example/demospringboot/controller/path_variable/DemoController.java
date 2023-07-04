package com.example.demospringboot.controller.path_variable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
public class DemoController {

    //ENDPOINT 1
    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Hello, This is my first Spring boot project...");
    }

    //ENDPOINT 2
    @RequestMapping("/welcome")
    public String message(){

        return "Hello, Welcome to SpringBoot..";
    }

    //ENDPOINT 3

    @RequestMapping("/sum")
    public String sum(){

        int a=5;
        int b=7;
        int sum=a+b;

        return "Sum of a and b is :"+sum;
    }
//ENDPOINT 4
    @RequestMapping("/course")
    public ArrayList<String> getCourser(){

        ArrayList<String> course= new ArrayList<>();

        course.add("java");
        course.add("Spring");
        course.add("Spring boot");

        return course;
    }

}
