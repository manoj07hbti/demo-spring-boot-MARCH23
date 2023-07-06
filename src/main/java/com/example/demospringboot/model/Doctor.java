package com.example.demospringboot.model;

public class Doctor {
    int id;
    String Department;
    String Hospital_Name;

    public Doctor(int id, String department, String hospital_Name) {
        this.id = id;
        Department = department;
        Hospital_Name = hospital_Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String hospital_Name) {
        Hospital_Name = hospital_Name;
    }
}
