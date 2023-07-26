package com.example.demospringboot.service;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.repository.Emp_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Emp_Service {
    @Autowired
    Emp_Repository repository;

    public String add(Employee employee){
        repository.save(employee);
        return "RECORD INSERTED SUCCESSFULLY";
    }

    public List<Employee> getEmp(){
        return repository.findAll();
    }
}
