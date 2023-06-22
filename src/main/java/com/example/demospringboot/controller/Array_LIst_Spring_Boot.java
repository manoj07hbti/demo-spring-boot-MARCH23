package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Array_LIst_Spring_Boot {
    @RequestMapping("/Brand")

    public ArrayList<String> allBrands(){
        ArrayList<String> brand=new ArrayList<>();
        brand.add("o3");
        brand.add("Fortune");
        brand.add("LG");
        brand.add("Soap");
        brand.add("Biscuit");
        return brand;

    }

}
