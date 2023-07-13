package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class EmployeeCRUDusingRequestBody {
    ArrayList<Employee> employeeArraydata=new ArrayList<>();

    @PostMapping("/addemploy")
    public String addemp(@RequestBody Employee employee) {

    employeeArraydata.add(employee);
    return "employee added successfully";
    }
    @GetMapping("/getemploy")
    public ArrayList<Employee> getemploy(){
        return employeeArraydata;

    }
    @PutMapping("/update_employ")
    public String updateemploy(@PathVariable String name, @PathVariable int index ){
        Employee employee=employeeArraydata.get(index);
        employee.setName(name);
        return "upadated successfully";
    }
    @DeleteMapping("/removeemploy")
    public String removeemploy(@PathVariable int index){
        employeeArraydata.remove(index);
        return "removed successfully";
    }
}