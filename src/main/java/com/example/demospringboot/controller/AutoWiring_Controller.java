package com.example.demospringboot.controller;

import com.example.demospringboot.Service.Test_Service;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoWiring_Controller {
    @Autowired
    Test_Service obj;

    @GetMapping("/autowiring")
    public String Demo(){
        return obj.BikeService();
    }
    @Autowired
    Test_Service obj1;

    @GetMapping("/service")
    public String Demo1(){
        return obj.CarService();

    }
    @Autowired
    Test_Service fess;

    @GetMapping("/FessService")
    public String Student(){
        return obj.FessService();

    }





}
