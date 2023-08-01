package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/get_all_native")
    public List<Student> getStudentsNative(){

        return service.getStudentsNative();

    }

    @PutMapping("/update_std_db/{id}/{name}")
    public String updateStudent(@PathVariable long id, @PathVariable String name){

      return  service.updateStudent(id,name);
    }

    @DeleteMapping("/delete_std_db/{id}")
    public String delete(@PathVariable long id){

        return service.delete(id);
    }

    @GetMapping("/find_by_id/{id}")
    public Optional<Student> getStudent(@PathVariable long id){

        return service.findStudentById(id);
    }

    @GetMapping("/find_by_roll_no/{roll_no}")
    public Student getStudent(@PathVariable int roll_no){

        return service.findStudentByRollNo(roll_no);
    }

    @GetMapping("/find_by_roll_no_name/{roll_no}/{name}")
    public Student getStudent(@PathVariable int roll_no,@PathVariable String name){

        return service.findStudentByRollNoName(roll_no,name);
    }

    @GetMapping("/find_by_native/{roll_no}/{section}")
    public Student getStudentNative(@PathVariable int roll_no,@PathVariable String section){

        return service.findStudentNative(roll_no,section);
    }

}
