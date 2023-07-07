package com.example.demospringboot.controller.Postaman_Anotation;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employee_CRUD_Postman {
    // C-Creating Data=============================================
    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    @PostMapping("Create_EmpData")
    public ArrayList<Employee> emp_List (@RequestParam String Name, @RequestParam String Company_Name,
                                         @RequestParam int Salary){

        Employee emp =new Employee(Name,Company_Name,Salary);
        employeeArrayList.add(emp);
        return employeeArrayList;
    }

    //R-Read the Data=================================================
    @GetMapping("/Get_EmpData")
    public ArrayList<Employee> GetEmployeeData(){
        return employeeArrayList;
    }

    //U- Update Data==================================================

    @PutMapping("/update_EmpData")
    public ArrayList<Employee> employeeUpdateData(@RequestParam int index,@RequestParam String company_Name){
        Employee updateEmp=employeeArrayList.get(index);
        updateEmp.setCompany_Name(company_Name);
        return employeeArrayList;
    }

    //D- Delete Data===================================================

    @DeleteMapping("/Del_EmpData")
    public ArrayList<Employee> delEmpData(@RequestParam int index){
        employeeArrayList.remove(index);
        return employeeArrayList;
    }

}
