package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.service.DBEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBEmpController {
    // CRUD OPERATION
    // C-create or add data into database
    @Autowired
    DBEmpService service;// here autowired service class
    @PostMapping("/add_empl") // endpoint for add and Assign whole object of model class through @Request body annotation
    public String addemp(@RequestBody Employee employee){
        return service.add_empl(employee);
    }
    // R- RAED  OR GET DATA FROM DATABASE
    @GetMapping("/emp_get_db")// endpoint for get all employees list
    public List<Employee> get_emp(){
        return service.empget();
    }

    // U-UPDATE DATA OF DATABASE
    @PutMapping("/update_emp_db/{id}/{name}")
    public String updateemploy(@PathVariable Long id,@PathVariable String name){
        return service.update_empl(id,name);
    }

    // D- DELETE DATA OF BY EMPLOYEE ID
    @DeleteMapping("/delempl/{id}")
    public String delemp(@PathVariable Long id){
        return service.deleteempl(id);

    }
}

