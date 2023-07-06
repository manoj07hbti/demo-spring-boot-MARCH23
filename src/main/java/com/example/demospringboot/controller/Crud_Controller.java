package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Crud_Controller {
    ArrayList<String> Course=new ArrayList<>();

    @RequestMapping("/add_Course/{input}")
    public String add(@PathVariable String input){
        Course.add(input);
        return input +"Added successfully";
    }
    @RequestMapping("/get_Course")
    public ArrayList<String> getCourse(){
        return Course;
    }

    @RequestMapping("/update_course/{index}/{name}")
    public String update_course(@PathVariable String name,@PathVariable int index){
        Course.set(index,name);
        return name +"update successfully";
    }

    @RequestMapping("/delete_course/{index}")
    public String delete_course(@PathVariable int index){
        Course.remove(index);
        return "delete successfully";
    }

}
