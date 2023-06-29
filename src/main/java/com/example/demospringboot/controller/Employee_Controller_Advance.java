package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Controller_Advance {

    @RequestMapping("/create_Employee/{name}/{id_no}/{department}")
    public Employee createEmployee(@PathVariable String name, @PathVariable int id_no, @PathVariable String department){

        return new Employee(name,id_no,department);

    }

}
