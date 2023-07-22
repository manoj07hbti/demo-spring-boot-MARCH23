package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DBController {
    //CREATE
    @Autowired
    DBService service;
    @PostMapping("/add_std_db")
    public String addStudent(@RequestBody Student student){

        return service.add(student);

    }

    @GetMapping("/get_all_db")
    public List<Student> getStudents(){

       return service.getStudents();

    }


}
