package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentCrudController {

    ArrayList<Student> studentArrayList= new ArrayList<>();

    @PostMapping("/add_student/{name}/{roll_no}/{section}")
    public String add(@PathVariable String name,@PathVariable int roll_no,@PathVariable String section){

        Student student= new Student(name,roll_no,section);

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
