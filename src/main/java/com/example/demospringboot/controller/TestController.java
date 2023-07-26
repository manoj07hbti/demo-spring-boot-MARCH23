package com.example.demospringboot.controller;

import com.example.demospringboot.controller.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService obj;

    @GetMapping("/autowiring")

    public String demo(){

        return obj.myBusinessRule();
    }
}
