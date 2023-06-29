package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDController {

    ArrayList<String> course=new ArrayList<>();

    //CRUD
    //CREATE
    @RequestMapping("/add_course/{input}")
    public String add(@PathVariable String input){

        course.add(input);

        return input+" Added successfully...";
    }

    //READ
    @RequestMapping("/get_courses")
    public ArrayList<String> getCourse(){

        return course;
    }
    //U- UPDATE
    @RequestMapping("/update_course/{name}/{index}")
    public String updateCourse(@PathVariable String name,@PathVariable int index){

       course.set(index,name);

       return name+ " Updated Successfully..";
    }

    //D-DELETE
    @RequestMapping("/remove_course/{index}")
    public String delete(@PathVariable int index){

        course.remove(index);

        return "Delete Successfully..";
    }


}
