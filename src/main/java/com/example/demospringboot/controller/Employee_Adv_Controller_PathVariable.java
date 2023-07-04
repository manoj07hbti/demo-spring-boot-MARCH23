package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee_Class;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_Adv_Controller_PathVariable {
    ArrayList<Employee_Class> employeeClassArrayListArraylist=new ArrayList<>();

    @RequestMapping("/Create_Employee/{Name}/{id}/{Department}")
    public Employee_Class CreateEmp(@PathVariable String Name,@PathVariable int id, @PathVariable String Department){
        return new Employee_Class(Name,id,Department);
    }
    @RequestMapping("/Create_Employee_list/{Name}/{id}/{Department}")
    public ArrayList<Employee_Class> CreateEmpList(@PathVariable String Name,@PathVariable int id,@PathVariable String Department){

        Employee_Class employeeClass=new Employee_Class(Name,id,Department);
        employeeClassArrayListArraylist.add(employeeClass);
        return employeeClassArrayListArraylist;
    }
    @RequestMapping("/foundEmp/{id}")
    public Employee_Class foundID(@PathVariable int id){
        Employee_Class found=null;
        for (Employee_Class emp_Id: employeeClassArrayListArraylist){
            if (id==emp_Id.getId()){
                found=emp_Id;

            }
        }
        return found;

    }



}
