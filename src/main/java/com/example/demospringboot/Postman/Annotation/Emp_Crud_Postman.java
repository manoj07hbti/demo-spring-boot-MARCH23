package com.example.demospringboot.Postman.Annotation;

import com.example.demospringboot.model.Employee_Class;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Emp_Crud_Postman {
    ArrayList<Employee_Class> EmpArrayList=new ArrayList<>();

    @PostMapping("/add_emp_post/{Name}/{id}/{Department}")
    public String add_emp(@PathVariable String Name,@PathVariable int id,@PathVariable String Department){
        Employee_Class employee_class=new Employee_Class(Name,id,Department);
        EmpArrayList.add(employee_class);
        return "Added emp successfully";
    }
    @GetMapping("/get_doctor_post")
    public ArrayList<Employee_Class>getEmpArray(){
        return EmpArrayList;
    }
    @PutMapping("/update_doctor_post/{index}/{Name}")
    public String update_emp(@PathVariable String Name,@PathVariable int index){
        Employee_Class employee_class=EmpArrayList.get(index);
        employee_class.setName(Name);
        return "update Emp Successfully";
    }
    @DeleteMapping("/delete_emp_post/{index}")
    public String delete_emp(@PathVariable int index){
        EmpArrayList.remove(index);
        return "Remove Emo successfully";

    }

}
