package com.example.demospringboot.controller.path_variable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Square_Controller {

    //ENDPOINT
    @RequestMapping("/square")
    public String square(){
        int a=5;
        int b=a*a;
        return "the square of number is : "+b;

    }
}
