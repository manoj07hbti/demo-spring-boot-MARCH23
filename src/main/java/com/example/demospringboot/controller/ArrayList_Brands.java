package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ArrayList_Brands {

    @RequestMapping("/brands")
    public ArrayList<String> getBrand(){
        ArrayList<String> brand=new ArrayList<>();
        brand.add("DELL");
        brand.add("HP");
        brand.add("ASUS");
        brand.add("SAMSUNG");
        return brand;
    }
}
