package com.example.demospringboot.postman_annotations;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Employee_CRUD_Postman {
        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        //create


        @PostMapping("/add_emp_post/{id}/{name}/{department}")
        public String add(@PathVariable int id, @PathVariable String name, @PathVariable String department){
            Employee emp=new Employee(name,id,department);
            employeeArrayList.add(emp);
            return "employee added successfully";
        }
        //read
        @GetMapping("/get_emp_post")
        public ArrayList<Employee>getEmployee(){
            return employeeArrayList;
        }
        @PutMapping("/update_emp_post/{index}/{name}")
        public String updateEmployee(@PathVariable int index,@PathVariable String name){
            Employee emp = employeeArrayList.get(index);
            emp.setName(name);
            return name+" updated successfully";
        }
        //delete
        @DeleteMapping("/delete_emp_post/{index}")
        public String deleteEmployee(@PathVariable int index){
            employeeArrayList.remove(index);
            return "employee removed successfully";
        }

    }
