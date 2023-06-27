package com.example.demospringboot.controller;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoControllerAdvance {

    ArrayList<Student> studentArrayList= new ArrayList<>();
    @RequestMapping("/create_student/{name}/{roll_no}/{section}")
    public Student createStudent(@PathVariable String name,@PathVariable int roll_no,@PathVariable String section){

       return new Student(name,roll_no,section);

    }

    @RequestMapping("/create_student_list/{name}/{roll_no}/{section}")
    public ArrayList<Student> createStudentList(@PathVariable String name,@PathVariable int roll_no,@PathVariable String section){


        Student student= new Student(name,roll_no,section);
        studentArrayList.add(student);

        return studentArrayList;

    }


    @RequestMapping("/find_student/{roll_no}")
    public Student getStudentByRollNo(@PathVariable int roll_no) {

        Student found_student = null;
        for (Student student : studentArrayList) {

            if (roll_no == student.getRoll_no()) {

                found_student= student;
            }

        }

        return found_student;

    }

}
