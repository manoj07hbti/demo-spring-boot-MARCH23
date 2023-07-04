package com.example.demospringboot.controller.path_variable;

import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Stu_ControllerAdvance_PathVariable {
    ArrayList<Student> studentArrayList=new ArrayList<>();
    @RequestMapping("/create_student/{name}/{section}/{roll_no}")
    public Student createstudent(@PathVariable String name,@PathVariable String section,@PathVariable int roll_no){
        return new Student(name,section,roll_no);
    }

    @RequestMapping("/create_student_list/{name}/{section}/{roll_no}")
    public ArrayList<Student> createStudentList(@PathVariable String name,@PathVariable String section, @PathVariable int roll_no){

        Student student=new Student(name, section, roll_no);
        studentArrayList.add(student);
        return studentArrayList;
    }

    @RequestMapping("/find_student/{roll_no}")
    public Student foundByRollNo( @PathVariable  int roll_no){
        Student found_student=null;
        for(Student student:studentArrayList){
            if(roll_no== student.getRoll_no()){
                found_student= student;
            }
        }
        return found_student;
    }
}



