package com.example.demospringboot.controller;

import com.example.demospringboot.service.Test_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Autowiring_Test_Controller {
    @Autowired //spring Annotation to create Object====================================
    Test_Service obj;
    @GetMapping("/autowiring")
    public String Demo_test(){

        return obj.Business_Rule();
    }
}
