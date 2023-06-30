package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeListRequestParam {

    ArrayList<Employee> employeelist=new ArrayList<>();

@RequestMapping("/craeteemp")
public Employee createEmp(@RequestParam String name,@RequestParam String dept,@RequestParam int salary){
    return new Employee(name,dept,salary);
 }
 @RequestMapping("/emplist")
 public ArrayList<Employee> createEmpList(@RequestParam String name,@RequestParam String dept,@RequestParam int salary){
    Employee employee=new Employee(name,dept,salary);
    employeelist.add(employee);
    return employeelist;
 }
 @RequestMapping("/getemp")
 public Employee getemployeebyname(@RequestParam String name){
    Employee Emp_name=null;
    for (Employee employee:employeelist){
        if (name.equals(employee.getName())){
            Emp_name=employee;

        }
    }
    return Emp_name;

 }

}
