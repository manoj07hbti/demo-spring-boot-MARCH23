package com.example.demospringboot.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String myBusinessRule(){

        return "This is my test business Rule...";
    }
}
