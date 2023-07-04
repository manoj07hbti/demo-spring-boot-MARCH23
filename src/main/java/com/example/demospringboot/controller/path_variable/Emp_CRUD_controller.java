package com.example.demospringboot.controller.path_variable;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Emp_CRUD_controller {
    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //create
    @RequestMapping("/add_employee/{id}/{name}/{department}")
    public String add(@PathVariable int id, @PathVariable String name, @PathVariable String department){
        Employee emp=new Employee(name,id,department);
        employeeArrayList.add(emp);
        return "employee added successfully";
    }
    //read
    @RequestMapping("/get_employee")
    public ArrayList<Employee>getEmployee(){
        return employeeArrayList;
    }
    @RequestMapping("/update_employee/{index}/{name}")
    public String updateEmployee(@PathVariable int index,@PathVariable String name){
        Employee emp = employeeArrayList.get(index);
        emp.setName(name);
        return name+" updated successfully";
    }
    //delete
    @RequestMapping("/delete_employee/{index}")
    public String deleteEmployee(@PathVariable int index){
        employeeArrayList.remove(index);
        return "employee removed successfully";
    }
}
