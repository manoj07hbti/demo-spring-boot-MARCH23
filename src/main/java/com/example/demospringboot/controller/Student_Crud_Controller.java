package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student_class;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Student_Crud_Controller {
    ArrayList<Student_class> StudentArraylist=new ArrayList<>();
    @RequestMapping("/student_add/{name}/{roll_no}/{section}")
    public String add(@PathVariable String name,@PathVariable int roll_no,@PathVariable String section){
        Student_class student_class=new Student_class(name,roll_no,section);
        StudentArraylist.add(student_class);
        return "Added Successfully";
    }
    @RequestMapping("/get_student")
    public ArrayList<Student_class>getStudent(){
        return StudentArraylist;
    }
    @RequestMapping("/update_student/{name}/{index}")
    public String updateStudent(@PathVariable String name,@PathVariable int index){
        Student_class student_class=StudentArraylist.get(index);
        student_class.setName(name);
        return "Update Successfully";
    }
    @RequestMapping("/delete_student/{index}")
    public String deleteStudent(@PathVariable int index){
        StudentArraylist.remove(index);
        return "Delete Successfully";
    }
}
