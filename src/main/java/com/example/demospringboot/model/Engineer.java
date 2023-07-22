package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Engineer_Data_23")
public class Engineer {
    @Id
    @GeneratedValue
    long Eng_Id;
    String name;
    String department;
    int Salary;

    public Engineer() {
    }

    public Engineer(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
