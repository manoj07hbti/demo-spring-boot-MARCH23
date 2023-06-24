package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AssController {
    @RequestMapping("/brands")
    public ArrayList<String> brandArraylist(){
        ArrayList<String> brandsarray=new ArrayList<>();
        brandsarray.add("DELL");
        brandsarray.add("H.P.");
        brandsarray.add("APPLE");
        brandsarray.add("SAMSUNG");
        brandsarray.add("ASUS");
        brandsarray.add("HCL");
        brandsarray.add("MICROTEK");
        brandsarray.add("INTEL");

        return brandsarray;
    }
}
