package com.example.demospringboot.controller;

import com.example.demospringboot.service.App_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_Controller {

    @Autowired
    App_Service service;
    @GetMapping("/app_Flow")
    public String controllerDemo(){
        return service.serviceDemo();

    }

}
