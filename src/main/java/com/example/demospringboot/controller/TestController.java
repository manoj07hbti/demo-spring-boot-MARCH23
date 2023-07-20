package com.example.demospringboot.controller;

import com.example.demospringboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
   /* @Autowired
      ClassName objName;*/
    @Autowired
    TestService obj;

    @GetMapping("/autowiring")
    public String demo() {

        //TestService obj = new TestService(); do not use core java to create object
        return obj.myBusinessRule();

    }
}
