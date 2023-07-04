package com.example.demospringboot.controller.pathvariable;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController()
public class AdvEmp_Controller_PathVariable {
    ArrayList<Employee> employeeArrayList=new ArrayList<>();

//Creating Employee Data in a list========================================================
@RequestMapping("Employee_List/{Name}/{Company_Name}/{Salary}")
public ArrayList<Employee> employee_List (@PathVariable String Name, @PathVariable String Company_Name,
                                 @PathVariable int Salary){

    Employee emp =new Employee(Name,Company_Name,Salary);
    employeeArrayList.add(emp);
    return employeeArrayList;
}
}
