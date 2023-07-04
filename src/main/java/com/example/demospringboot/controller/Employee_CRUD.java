package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employee_CRUD {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    @PostMapping("/add_empl/{name}/{dept}/{salary}")
    public String addempl( @PathVariable String name, @PathVariable String dept, @PathVariable int salary){
        Employee employee=new Employee(name,dept,salary);
        employeeArrayList.add(employee);
        return "Employee added successfully";
    }

    @GetMapping("/get_empl")
    public ArrayList<Employee> getEmployeeslist(){
        return employeeArrayList;
    }

    @PutMapping("/update_empl/{name}/{index}")
    public String updateEmpl(@PathVariable String name,@PathVariable int index){
        Employee employee=employeeArrayList.get(index);
        employee.setName(name);
        return "Epmloyee updated successfully";
    }

    @DeleteMapping("/remove_empl/{index}")
    public String removeEmpl(@PathVariable int index){
        employeeArrayList.remove(index);
        return "Epmloyee deleted successfully";
    }

}
