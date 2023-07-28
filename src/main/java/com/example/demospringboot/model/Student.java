package com.example.demospringboot.model;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="STUDENT_MARCH")
public class Student {
    @Id
    @GeneratedValue
    long id;
    String name;
    String section;
    int rollNo;

    //default constructor
    public Student() {
    }

    public Student(String name, String section, int roll_no) {
        this.name = name;
        this.section = section;
        this.rollNo = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRoll_no() {
        return rollNo;
    }

    public void setRoll_no(int roll_no) {
        this.rollNo = roll_no;
    }
}
