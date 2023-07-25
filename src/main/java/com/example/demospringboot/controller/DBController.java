package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update_std_db/{id}/{name}")
    public String updateStudent(@PathVariable long id, @PathVariable String name){

      return  service.updateStudent(id,name);
    }

    @DeleteMapping("/delete_std_db/{id}")
    public String delete(@PathVariable long id){

        return service.delete(id);
    }

}
