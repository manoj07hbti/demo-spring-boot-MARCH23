package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class City_CRUD_Opertion {
    ArrayList<String> cityArrayList=new ArrayList<>();
    // CRUD
    // C-create
    @PostMapping("/addcity")
    public String addcity(@RequestParam String urban){
       cityArrayList.add(urban);
       return urban + " city added successfully";
    }
    //R-READ OR GET DATA
    @GetMapping("/get_city")
    public ArrayList<String> getcity(){
        return cityArrayList;

    }
    //U-UPDATE
    @PutMapping("/update_city")
    public String update(@RequestParam int index,@RequestParam String cityname ){
        cityArrayList.set(index,cityname);
        return cityname+ " update successfully";
    }
    //D-DELETE
    @DeleteMapping("/remove_city")
    public String delete(@RequestParam int index){
        cityArrayList.remove(index);
        return " remove successfully";
    }
}
