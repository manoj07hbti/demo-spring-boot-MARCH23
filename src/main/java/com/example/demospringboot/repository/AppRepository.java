package com.example.demospringboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {

    public String demo(){

        return "This is Repository class";
    }
}
