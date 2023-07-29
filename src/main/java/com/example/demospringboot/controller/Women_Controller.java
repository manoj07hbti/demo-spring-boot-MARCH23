package com.example.demospringboot.controller;

import com.example.demospringboot.Service.DBWomen_Service;
import com.example.demospringboot.model.Women_Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Women_Controller {
    @Autowired
    DBWomen_Service dbWomenService;
    @PostMapping("/add_women")
    public String Women_Controller(@RequestBody Women_Class women_class) {
        return dbWomenService.addWomen_Class(women_class);

    }
    @PutMapping("/Update_women/{id}/{name}")
    public String update_women(@PathVariable long id,@PathVariable String name){
        return dbWomenService.update_women1(id,name);

    }
    @DeleteMapping("/del_women/{id}")
    public String del_women(@PathVariable Long id){
        return dbWomenService.del_Women(id);

    }



}
