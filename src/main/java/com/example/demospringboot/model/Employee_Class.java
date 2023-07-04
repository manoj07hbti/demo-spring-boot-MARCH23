package com.example.demospringboot.model;

public class Employee_Class {
    String Name;
    int id;
    String Department;

    public Employee_Class(String Name,int id,String Department){
        this.Name= Name;
        this.id=id;
        this.Department=Department;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getDepartment(){
        return Department;
    }
    public void setDepartment(String Department){
        this.Department=Department;

    }
}
