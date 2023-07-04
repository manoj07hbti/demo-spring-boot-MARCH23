package com.example.demospringboot.controller.pathvariable;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Creating Employee Data==========================================
@RestController()
public class Employee_Controller_PathVariable {
    @RequestMapping("Employee/{Name}/{Company_Name}/{Salary}")
    public Employee advanceEmployee (@PathVariable String Name, @PathVariable String Company_Name,
                                     @PathVariable int Salary){

        return new Employee(Name,Company_Name,Salary);
    }

}
