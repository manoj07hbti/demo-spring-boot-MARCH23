package com.example.demospringboot.controller.request_param;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Emp_AdvController_RequestParam {
    ArrayList<Employee> EmpArraylist=new ArrayList<>();

    @RequestMapping("/create_employee")
    public Employee createEmp(@RequestParam String name, @RequestParam int id, @RequestParam String department){
        return new Employee(name,id,department);
    }

    //create list of employees
    @RequestMapping("/create_employee_list")
    public ArrayList<Employee> createEmpList(@RequestParam String name,@RequestParam int id, @RequestParam String department){


        Employee emp=new Employee(name,id,department);
        EmpArraylist.add(emp);
        return EmpArraylist;

    }

    //find employee
    @RequestMapping("/found_employee")
    public Employee foundById(@RequestParam int id){
        Employee found_emp=null;
        for(Employee emp_id: EmpArraylist){
            if(id== emp_id.getId()){
                found_emp=emp_id;
            }
        }
        return found_emp;
    }
}
