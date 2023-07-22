package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Employee_Data_23")
public class Employee {
    @Id  //It will make this field as primary key=====================================
    @GeneratedValue  // it will automatically assign this value to id and increase by one=====================
    long Emp_Id;
    String name;
    String company_Name;
    int salary;

    // Creating Default Constructor=======================================================
    public Employee() {
    }

    public Employee(String name, String company_Name, int salary){

        this.name=name;
        this.company_Name=company_Name;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
