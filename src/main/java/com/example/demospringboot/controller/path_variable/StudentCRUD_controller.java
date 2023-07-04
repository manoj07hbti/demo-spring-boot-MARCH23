package com.example.demospringboot.controller.path_variable;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class StudentCRUD_controller {
    ArrayList<Student> studentArrayList=new ArrayList<>();

    //create
    @RequestMapping("/add_student/{name}/{section}/{rollNo}")
    public String add(@PathVariable String name,@PathVariable int rollNo,@PathVariable String section){
        Student student=new Student(name,section,rollNo);
        studentArrayList.add(student);
        return "student added successfully";
    }
    //read
    @RequestMapping("/get_students")
    public ArrayList<Student>getStudents(){
        return studentArrayList;
    }
    @RequestMapping("/update_student/{index}/{name}")
    public String updateStudent(@PathVariable int index,@PathVariable String name){
     Student student = studentArrayList.get(index);
     student.setName(name);
     return name+" updated successfully";
    }
    //delete
    @RequestMapping("/delete_student/{index}")
    public String deleteStudent(@PathVariable int index){
        studentArrayList.remove(index);
        return " student removed successfully";
    }

}
