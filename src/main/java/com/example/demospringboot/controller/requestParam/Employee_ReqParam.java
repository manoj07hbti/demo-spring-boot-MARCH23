package com.example.demospringboot.controller.requestParam;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_ReqParam {

    ArrayList<Employee>createEmployeeData=new ArrayList<>();
    @RequestMapping("/createEmpData")
    public ArrayList<Employee> create_Employee(@RequestParam String Name, @RequestParam String Company_Name,
                                               @RequestParam int Salary ){

        Employee createEmployee=new Employee(Name,Company_Name,Salary);

        createEmployeeData.add(createEmployee);

        return createEmployeeData;
    }
}
