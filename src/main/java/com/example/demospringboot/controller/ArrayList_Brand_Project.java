package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class ArrayList_Brand_Project {
    @RequestMapping("/brand")

    public ArrayList<String> allBrands(){

        ArrayList<String> brand = new ArrayList<>();


        brand.add("TVS");
        brand.add("MRF");
        brand.add("HCL");
        brand.add("LG");
        brand.add("BPL");
        brand.add("SAMSUNG");
        brand.add("HAIR");
        brand.add("JBL");
        brand.add("OPPO");
        brand.add("JM");
        return brand;


    }



}
