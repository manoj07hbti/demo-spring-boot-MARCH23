package com.example.demospringboot.service;

import com.example.demospringboot.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    AppRepository repository;
    public String demoService(){

        return repository.demo();
    }
}
