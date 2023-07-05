package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Employee_Crud_Controller {
    ArrayList<Employee> EmployeeArrayList = new ArrayList<>();
  @RequestMapping("/Employee_joint/{name}/{id_no}/{Department}")
    public String add (@PathVariable String name,@PathVariable int id_no,@PathVariable String Department ){

        Employee employee = new Employee(name,id_no,Department);

        EmployeeArrayList.add(employee);

        return "Employee added  Successfully";

    }
}
