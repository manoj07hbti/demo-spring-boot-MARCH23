package com.example.demospringboot.controller.requestParam;

import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_Adv_RequestParam {
        ArrayList<Employee> employeeArrayList=new ArrayList<>();

        //Creating Employee Data in a list========================================================
        @RequestMapping("Emp_List")
        public ArrayList<Employee> employee_List (@RequestParam String Name, @RequestParam String Company_Name,
                                                  @RequestParam int Salary){

            Employee emp =new Employee(Name,Company_Name,Salary);
            employeeArrayList.add(emp);
            return employeeArrayList;
        }

        //Emp list Search by salary================================================================
        @RequestMapping("/findEmp_By_Salary")
        public Employee empFind_Salary(@RequestParam int Salary){
            Employee find_empSalary = null;

            for (Employee emp_salary:employeeArrayList){

                if (Salary==emp_salary.getSalary()){

                    find_empSalary=emp_salary;
                }
            }
            return find_empSalary;
        }

    }
