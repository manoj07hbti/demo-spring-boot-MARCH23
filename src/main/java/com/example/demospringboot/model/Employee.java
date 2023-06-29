package com.example.demospringboot.model;

public class Employee {

    String name;
    int id_no;
    String department;

    public Employee(String name, int id_no, String department) {
        this.name = name;
        this.id_no = id_no;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
