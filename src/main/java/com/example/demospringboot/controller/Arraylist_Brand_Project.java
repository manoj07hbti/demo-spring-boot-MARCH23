package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
//make java class to Controller Class====================================================
public class Arraylist_Brand_Project {
    @RequestMapping("/brand")
    //End Point for execute =============================================================
    public ArrayList<String> allBrands(){

        ArrayList<String> brand=new ArrayList<>();
        brand.add("Levis");
        brand.add("Spyker");
        brand.add("Armani");
        brand.add("Tata");
        brand.add("Zara");
        brand.add("Philips");
        return brand;
    }
}
