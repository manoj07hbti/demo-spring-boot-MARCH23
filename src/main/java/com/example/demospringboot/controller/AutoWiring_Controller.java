package com.example.demospringboot.controller;

import com.example.demospringboot.Service.All_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoWiring_Controller {
    @Autowired
    All_Service obj;

    @GetMapping("/autowiring")
    public String Demo(){
        return obj.BikeService();
    }
    @Autowired
    All_Service obj1;

    @GetMapping("/service")
    public String Demo1(){
        return obj.CarService();

    }
    @Autowired
    All_Service fess;

    @GetMapping("/FessService")
    public String Student(){
        return obj.FessService();

    }





}
