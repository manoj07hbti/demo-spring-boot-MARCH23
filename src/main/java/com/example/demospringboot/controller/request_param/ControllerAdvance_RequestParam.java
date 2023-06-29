package com.example.demospringboot.controller.request_param;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public class ControllerAdvance_RequestParam {
    ArrayList<Student> studentArrayList=new ArrayList<>();
    @RequestMapping("/create_student")
    public Student createstudent(@RequestParam String name, @RequestParam String section, @RequestParam int roll_no){
        return new Student(name,section,roll_no);
    }

    //ADDING STUDENT INTO ARRAY LIST
    @RequestMapping("/create_student_list")
    public ArrayList<Student> createStudentList(@RequestParam String name,@RequestParam String section, @RequestParam int roll_no){

        Student student=new Student(name, section, roll_no);
        studentArrayList.add(student);
        return studentArrayList;
    }

    //FIND STUDENT BY ROLL NUMBER
    @RequestMapping("/find_student")
    public Student foundByRollNo( @RequestParam  int roll_no){
        Student found_student=null;
        for(Student student:studentArrayList){
            if(roll_no== student.getRoll_no()){
                found_student= student;
            }
        }
        return found_student;
    }
}
