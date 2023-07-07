package com.example.demospringboot.controller.CRUD_Project;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.ArrayList;

@RestController
public class Emp_PathVariable {

    // C-Creating Data=============================================
    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    @RequestMapping("CreateEmployee_List/{Name}/{Company_Name}/{Salary}")
    public ArrayList<Employee> employee_List (@PathVariable String Name, @PathVariable String Company_Name,
                                              @PathVariable int Salary){

        Employee emp =new Employee(Name,Company_Name,Salary);
        employeeArrayList.add(emp);
        return employeeArrayList;
    }

    //R-Read the Data=================================================
    @RequestMapping("/GetEmp_Data")
    public ArrayList<Employee> readData(){
        return employeeArrayList;
    }

    //U- Update Data==================================================

    @RequestMapping("/updateEmp/{index}/{company_Name}")
    public ArrayList<Employee> updateEmpData(@PathVariable int index,@PathVariable String company_Name){
        Employee updateEmp=employeeArrayList.get(index);
        updateEmp.setCompany_Name(company_Name);
        return employeeArrayList;
    }

    //D- Delete Data===================================================

    @RequestMapping("/DelEmpData/{index}")
    public ArrayList<Employee> deleteEmpData(@PathVariable int index){
        employeeArrayList.remove(index);
        return employeeArrayList;
    }

}
