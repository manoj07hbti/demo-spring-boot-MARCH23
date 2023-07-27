package com.example.demospringboot.service;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.repository.Employee_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Emp_Service {

    @Autowired
    Employee_Repository emp_repository;
    public String add(Employee emp){

        emp_repository.save(emp);// this query insert data into Database

        return "Record inserted successfully";
    }

    public List<Employee> getEmployee(){
        return emp_repository.findAll();  // this method collect all the data from database to read=======================
    }
}
