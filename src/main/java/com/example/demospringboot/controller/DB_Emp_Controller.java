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
public class DB_Emp_Controller {
    @Autowired
    Emp_Service Service;
    @PostMapping("/DB_Emp_Add")
    public String addEmp(@RequestBody Employee emp){

        return Service.add(emp);
    }

    @GetMapping("/Get_Emp_DB")
    public List<Employee> employeeList(){

        return Service.getEmployee();
    }

}
