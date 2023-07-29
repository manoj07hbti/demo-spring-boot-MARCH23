package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.service.Emp_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/Update_Emp_DB/{id}/{name}")
    public String updateEmp(@PathVariable long id,@PathVariable String name){

        return Service.updateEmp(id, name);

    }
    @DeleteMapping("/Delete_Emp_DB/{id}")
    public String delEmp(@PathVariable long id){
        return Service.delEmp(id);

    }

    @PutMapping("/Emp_By_ID/{id}")
    public Optional<Employee> findEmpID(@PathVariable long id){
        return Service.findEmpByID(id);
    }

}
