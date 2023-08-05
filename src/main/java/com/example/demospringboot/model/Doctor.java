package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name = "DOCTOR_MARCH_23")
public class Doctor {
    @Id
    @GeneratedValue
    long id;
    String name;
    int id_num ;
    String Speciality;

    public Doctor() {
    }

    public Doctor(String name, int id, String speciality) {
        this.name = name;
        this.id = id;
        Speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id_num;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
