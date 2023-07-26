package com.example.demospringboot.controller.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
@Service
public class TestService {

    public String myBusinessRule(){

        return "this is my test business rule ..... ";
    }
}
