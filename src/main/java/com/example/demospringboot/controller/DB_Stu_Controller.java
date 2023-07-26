package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.service.DB_Stu_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DB_Stu_Controller {

    @Autowired
    DB_Stu_Service service;
    @PostMapping("/add_stu_db") //CREATE
    public String add_stu(@RequestBody Student student){

        return service.add(student);
    }

    @GetMapping("/get_stu_db") // READ
    public List<Student> getStudents(){

        return service.getStudents();
    }

    @PutMapping("/update_stu_db/{id}/{name}") //UPDATE
    public String updateStudent(@PathVariable Long id ,@PathVariable String name){

        return service.updateStudents(id,name);
    }

    @DeleteMapping("/delete_stu_db/{id}") // delete
    public String delete_Student(@PathVariable Long id){
        return service.delete_Student(id);
    }

}
