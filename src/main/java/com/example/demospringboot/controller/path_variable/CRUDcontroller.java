package com.example.demospringboot.controller.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class CRUDcontroller {

    ArrayList<String> course = new ArrayList<>();
//create

    @RequestMapping("/add_course/{input}")
    public String add(@PathVariable String input) {
        course.add(input);
        return input + " added successfully";
    }

    //read
    @RequestMapping("/get_course")
    public ArrayList<String> getCourse() {
        return course;
    }

    //update
    @RequestMapping("/update_course/{index}/{name}")
    public String updateCourse(@PathVariable String name, @PathVariable int index) {
        course.set(index, name);
        return name + " updated successfully";
    }

    //delete
    @RequestMapping("/delete_course/{index}")
    public String deleteCourse(@PathVariable int index) {
        course.remove(index);

        return "delete successfully";
    }
}

