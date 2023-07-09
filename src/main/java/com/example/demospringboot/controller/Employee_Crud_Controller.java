package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Employee_Crud_Controller {
    ArrayList<Employee> EmployeeArrayList = new ArrayList<>();
  @PostMapping("/join_Employee/{name}/{id_no}/{Department}")
    public String add (@PathVariable String name,@PathVariable int id_no,@PathVariable String Department ){

        Employee employee = new Employee(name,id_no,Department);

        EmployeeArrayList.add(employee);

        return "Employee added  Successfully";

    }
@GetMapping("/get_employees")
    public ArrayList<Employee> getEmployeeArrayList() {
        return EmployeeArrayList;
    }
@PutMapping("/update_Employee/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index){

       Employee employee = EmployeeArrayList.get(index);
       employee.setName(name);

       return "name update successfully";
    }
    @DeleteMapping("/remove_employee/{index}")
    public String remove (@PathVariable int index){

      EmployeeArrayList.remove(index);
      return "Deleted successfully";
    }
}
