package com.example.demospringboot.service;

import com.example.demospringboot.repository.App_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class App_Service {

    @Autowired
    App_Repository repository;
    public String serviceDemo(){

        return repository.repoDemo();
    }
}
