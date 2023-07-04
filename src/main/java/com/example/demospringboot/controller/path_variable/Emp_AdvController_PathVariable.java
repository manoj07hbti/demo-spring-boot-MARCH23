package com.example.demospringboot.controller.path_variable;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Emp_AdvController_PathVariable {
    ArrayList<Employee> EmpArraylist=new ArrayList<>();

    @RequestMapping("/create_employee/{name}/{id}/{department}")
    public Employee createEmp(@PathVariable String name,@PathVariable int id,@PathVariable String department){
        return new Employee(name,id,department);
    }

    //create list of employees
    @RequestMapping("/create_employee_list/{name}/{id}/{department}")
    public ArrayList<Employee> createEmpList(@PathVariable String name,@PathVariable int id, @PathVariable String department){


        Employee emp=new Employee(name,id,department);
        EmpArraylist.add(emp);
        return EmpArraylist;

    }

    //find employee
    @RequestMapping("/found_employee/{id}")
    public Employee foundById(@PathVariable int id){
        Employee found_emp=null;
        for(Employee emp_id: EmpArraylist){
            if(id== emp_id.getId()){
               found_emp=emp_id;
            }
        }
        return found_emp;
    }

}
