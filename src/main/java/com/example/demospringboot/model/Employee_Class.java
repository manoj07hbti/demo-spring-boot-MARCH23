package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Employee_March")
public class Employee_Class{
    @Id
    @GeneratedValue
    long id_number;
    String Name;
    int id;
    String Department;

    public Employee_Class(){
    }

    public Employee_Class(String Name, int id, String Department){
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
