package com.example.demospringboot.controller.pathvariable;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController()
public class EmpAdvance_Controller_PathVariable {
    ArrayList<Employee> employeeArrayList=new ArrayList<>();

//Creating Employee Data in a list========================================================
@RequestMapping("Employee_List/{Name}/{Company_Name}/{Salary}")
public ArrayList<Employee> employee_List (@PathVariable String Name, @PathVariable String Company_Name,
                                 @PathVariable int Salary){

    Employee emp =new Employee(Name,Company_Name,Salary);
    employeeArrayList.add(emp);
    return employeeArrayList;
}

//Emp list Search by salary================================================================
@RequestMapping("/find_Employee/{Salary}")
    public Employee employeeFound_Salary(@PathVariable int Salary){
    Employee found_empSalary = null;

    for (Employee emp_salary:employeeArrayList){

     if (Salary==emp_salary.getSalary()){

        found_empSalary=emp_salary;
     }
    }
    return found_empSalary;
    }

}
