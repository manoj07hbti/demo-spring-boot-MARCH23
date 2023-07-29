package com.example.demospringboot.controller;

import com.example.demospringboot.Service.DBGanga_Service;
import com.example.demospringboot.model.Ganga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Ganga_Controller {
    @Autowired
    DBGanga_Service dbGanga_service;
    @PostMapping("/add_ganga")
    public String addGanga(@RequestBody Ganga ganga){
        return dbGanga_service.add_Ganga_list(ganga);
    }
    @GetMapping("/get_ganga")
    public List<Ganga> get_ganga(){
        return dbGanga_service.get_ganga();
    }

    @PutMapping("/update_ganga/{id}/{name}")
    public String update_ganga(@PathVariable Long id,@PathVariable String name){
        return dbGanga_service.Update_Ganga(id,name);

    }
    @DeleteMapping("/del_Ganga/{id}")
    public String del_Ganga(@PathVariable long id){
        return dbGanga_service.delete_ganga(id);

    }

}
