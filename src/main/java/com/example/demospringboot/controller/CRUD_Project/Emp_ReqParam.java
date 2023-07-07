package com.example.demospringboot.controller.CRUD_Project;


import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Emp_ReqParam {
    // C-Creating Data=============================================
    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    @RequestMapping("Create")
    public ArrayList<Employee> emp_List (@RequestParam String Name, @RequestParam String Company_Name,
                                              @RequestParam int Salary){

        Employee emp =new Employee(Name,Company_Name,Salary);
        employeeArrayList.add(emp);
        return employeeArrayList;
    }

    //R-Read the Data=================================================
    @RequestMapping("/Get")
    public ArrayList<Employee> GetEmployeeData(){
        return employeeArrayList;
    }

    //U- Update Data==================================================

    @RequestMapping("/update")
    public ArrayList<Employee> employeeUpdateData(@RequestParam int index,@RequestParam String company_Name){
        Employee updateEmp=employeeArrayList.get(index);
        updateEmp.setCompany_Name(company_Name);
        return employeeArrayList;
    }

    //D- Delete Data===================================================

    @RequestMapping("/Del")
    public ArrayList<Employee> delEmpData(@RequestParam int index){
        employeeArrayList.remove(index);
        return employeeArrayList;
    }
}
