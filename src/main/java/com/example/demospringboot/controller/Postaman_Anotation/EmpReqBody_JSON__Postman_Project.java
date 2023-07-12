package com.example.demospringboot.controller.Postaman_Anotation;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpReqBody_JSON__Postman_Project {
    // C-Creating Data=============================================
    ArrayList<Employee> empJsonList=new ArrayList<>();
    @PostMapping("/Create_Data")
    public ArrayList<Employee> emp_List (@RequestBody Employee emp){
        empJsonList.add(emp);
        return empJsonList;
    }

    //R-Read the Data=================================================
    @GetMapping("/Get_Data")
    public ArrayList<Employee> GetEmployeeData(){
        return empJsonList;
    }

    //U- Update Data==================================================

    @PutMapping("/update_Data")
    public ArrayList<Employee> employeeUpdateData(@RequestParam int index,@RequestParam String company_Name){
        Employee updateEmp=empJsonList.get(index);
        updateEmp.setCompany_Name(company_Name);
        return empJsonList;
    }

    //D- Delete Data===================================================

    @DeleteMapping("/Del_Data")
    public ArrayList<Employee> delEmpData(@RequestParam int index){
        empJsonList.remove(index);
        return empJsonList;
    }

}
