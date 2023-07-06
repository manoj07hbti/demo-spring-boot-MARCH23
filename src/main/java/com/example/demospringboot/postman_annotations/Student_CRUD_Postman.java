package com.example.demospringboot.postman_annotations;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Student_CRUD_Postman {
        ArrayList<Student> studentArrayList=new ArrayList<>();

        //create
        @PostMapping("/add_stu_post/{name}/{section}/{rollNo}")
        public String add(@PathVariable String name, @PathVariable int rollNo, @PathVariable String section){
            Student student=new Student(name,section,rollNo);
            studentArrayList.add(student);
            return "student added successfully";
        }
        //read

        @GetMapping("/get_stu_post")
        public ArrayList<Student>getStudents(){
            return studentArrayList;
        }
        @PutMapping("/update_stu_post/{index}/{name}")
        public String updateStudent(@PathVariable int index,@PathVariable String name){
            Student student = studentArrayList.get(index);
            student.setName(name);
            return name+" updated successfully";
        }
        //delete
        @DeleteMapping("/delete_stu_post/{index}")
        public String deleteStudent(@PathVariable int index){
            studentArrayList.remove(index);
            return " student removed successfully";
        }

    }
