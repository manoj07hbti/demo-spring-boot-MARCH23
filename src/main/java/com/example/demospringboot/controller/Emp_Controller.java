package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.service.Emp_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/update_emp_db/{id}/{name}")
    public String update_Emp(@PathVariable Long id,@PathVariable String name){
        return service.update_Emp(id,name);

    }
    @DeleteMapping("/delete_emp_db/{id}")
    public String delete_emp(@PathVariable Long id) {
        return service.delete_emp(id);
    }

    @GetMapping("/find_Employee_By_ID/{id}")
    public Optional<Employee> findEmployeeByID(@PathVariable long id){
        return service.findByID(id);
    }

    @GetMapping("/find_Employee_By_Name/{name}")
    public Employee findEmployeeByName(@PathVariable String name){
        return service.find_EmployeeByName(name);
    }
    @GetMapping("/find_Employee_By_Name_Department/{name}/{department}")
    public Employee findEmployeeByNameDepartment(@PathVariable String name,@PathVariable String department){
        return service.find_EmployeeByNameAndDepartment(name, department);
    }
}

