package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.service.Emp_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Emp_Controller {
    @Autowired
    Emp_Service service;

    @PostMapping("/add_emp_db")
    public String addEmp(@RequestBody Employee employee){
        return service.add(employee);
    }

    @GetMapping("/get_emp_db")
    public List<Employee> getEmp(){
        return service.getEmp();
    }
}
