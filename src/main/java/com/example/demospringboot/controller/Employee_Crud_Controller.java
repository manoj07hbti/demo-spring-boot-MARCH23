package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee_Class;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_Crud_Controller {
    ArrayList<Employee_Class> EmployeeArraylist=new ArrayList<>();

    @RequestMapping("/add_Emp/{Name}/{id}/{Department}")
    public String add(@PathVariable String Name,@PathVariable int id,@PathVariable String Department){
        Employee_Class Emp= new Employee_Class(Name,id,Department);
        EmployeeArraylist.add(Emp);
        return "Employee Added Successfully";
    }
    @RequestMapping("/get_employee_Class")
    public ArrayList<Employee_Class>getEmployeeArraylist(){
        return EmployeeArraylist;

    }
    @RequestMapping("/Update_Employee/{index}/{Name}")
    public String Update_Employee(@PathVariable int index,@PathVariable String Name){
        Employee_Class Emp=EmployeeArraylist.get(index);
        Emp.setName(Name);
        return Name +"Updated Successfully";
    }
    @RequestMapping("/delete_Employee/{index}")
    public String Delete_Employee(@PathVariable int index){
        EmployeeArraylist.remove(index);
        return index +"Delete Successfully";

    }
}
