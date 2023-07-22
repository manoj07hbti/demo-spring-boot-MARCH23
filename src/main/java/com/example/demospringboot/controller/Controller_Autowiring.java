package com.example.demospringboot.controller;

import com.example.demospringboot.service.Service_Autowiring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Autowiring {
    @Autowired
    Service_Autowiring serviceAutowiring; // autowired obj of service class
    @GetMapping("/pers_features")
    public String person(){
      return serviceAutowiring.human(); // method calling b

    }

}

