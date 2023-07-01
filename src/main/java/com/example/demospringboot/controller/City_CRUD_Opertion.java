package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class City_CRUD_Opertion {
    ArrayList<String> cityArrayList=new ArrayList<>();
    // CRUD
    // C-create
    @RequestMapping("/addcity")
    public String addcity(@RequestParam String urban){
       cityArrayList.add(urban);
       return urban + " city added successfully";
    }
    //R-READ OR GET DATA
    @RequestMapping("/get_city")
    public ArrayList<String> getcity(){
        return cityArrayList;

    }
    //U-UPDATE
    @RequestMapping("/update_city")
    public String update(@RequestParam int index,@RequestParam String cityname ){
        cityArrayList.set(index,cityname);
        return cityname+ " update successfully";
    }
    //D-DELETE
    @RequestMapping("/remove_city")
    public String delete(@RequestParam int index){
        cityArrayList.remove(index);
        return " remove successfully";
    }
}
