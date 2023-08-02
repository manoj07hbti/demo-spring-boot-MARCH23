package com.example.demospringboot.controller.app_architecture_controller;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.service.DB_Stu_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/find_Student_By_ID/{id}")
    public Optional<Student> findStudentByID(@PathVariable long id){
        return service.findStudentByID(id);
    }

    @GetMapping ("/find_Student_By_RollNo/{rollNo}")
    public Student getStudent(@PathVariable int rollNo){
       return  service.findStudentByRollNo(rollNo);
    }
    @GetMapping ("/find_Student_By_RollNo_Name/{rollNo}/{name}")
    public Student getStudent(@PathVariable int rollNo,@PathVariable String name){
        return  service.findStudentByRollNoName(rollNo,name);
    }
    @GetMapping ("/find_Student_By_native/{rollNo}/{section}")
    public Student findStudentNative(@PathVariable int rollNo,@PathVariable String section) {
        return service.findStudentNative(rollNo, section);
    }
    @GetMapping ("/find_Student_By_native")
    public List<Student> getStudentByNative() {
        return service.getStudentByNative();
    }
    }
