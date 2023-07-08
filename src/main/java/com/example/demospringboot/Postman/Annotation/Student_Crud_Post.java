package com.example.demospringboot.Postman.Annotation;

import com.example.demospringboot.model.Student_class;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Student_Crud_Post {
    ArrayList<Student_class>StuArraylist=new ArrayList<>();

    @PostMapping("/Add_stu_post/{name}/{roll_no}/{section}")
    public String add_stu(@PathVariable String name,@PathVariable int roll_no,@PathVariable String section){
        Student_class student_class=new Student_class(name,roll_no,section);
        StuArraylist.add(student_class);
        return "Added Stu Successfully";

    }
    @GetMapping("/get_stu_post")
    public ArrayList<Student_class>getStu(){
        return StuArraylist;

    }
    @PutMapping("/update_stu_Post/{index}/{name}")
    public String update_stud(@PathVariable String name,@PathVariable int index){
        Student_class student_class=StuArraylist.get(index);
        student_class.setName(name);
        return "update stud successfully";
    }
    @DeleteMapping("/delete_stud_post/{index}")
    public String delete_stud(@PathVariable int index){
        StuArraylist.remove(index);
        return "Remove stu successfully";

    }
}
