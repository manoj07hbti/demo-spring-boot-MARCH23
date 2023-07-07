package com.example.demospringboot.model;

import javax.naming.Name;

public class Engineer {
    String name;
    int age;
    String company;
    int salary;

    public Engineer(String name, int age, String company, int salary) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
