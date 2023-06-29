package com.example.demospringboot.model;

public class Employee_Class {
    String name;
    String company_Name;
    int salary;

    public Employee_Class (String name,String company_Name,int salary){

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
