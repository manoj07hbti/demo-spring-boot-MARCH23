package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCrudController {

    ArrayList<Student> studentArrayList= new ArrayList<>();

    @PostMapping("/add_student")
    public String add(@RequestBody  Student student){

        studentArrayList.add(student);
        return "Student Added Successfully....";

    }
    @GetMapping("/get_students")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }

    @PutMapping("/update_student/{name}/{index}")
    public String update(@PathVariable String name, @PathVariable int index){

        Student student= studentArrayList.get(index);
        student.setName(name);

        return "name Update successfully";
    }

    @DeleteMapping("/remove_student/{index}")
    public String remove(@PathVariable int index){

        studentArrayList.remove(index);

        return "Deleted Successfully..";
    }

}
