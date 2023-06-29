package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeList {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    @RequestMapping("/create_employee/{name}/{dept}/{salary}")
    public Employee craeteEmployee(@PathVariable String name,@PathVariable String dept,@PathVariable int salary){
        return new Employee(name,dept,salary);
    }
    @RequestMapping("/create_employeelist/{name}/{dept}/{salary}")
    public ArrayList<Employee> createEmployeelist(@PathVariable String name,@PathVariable String dept,@PathVariable int salary){

        Employee employee=new Employee(name,dept,salary);

        employeeArrayList.add(employee);

         return employeeArrayList;

    }
    @RequestMapping("/getEmployee/{name}")
    public Employee getEmployee(@PathVariable String name){
        Employee employee_name=null;
        for (Employee employee:employeeArrayList){
            if (name.equals(employee.getName())){
                employee_name=employee;

            }
        }
        return employee_name;

    }
}
