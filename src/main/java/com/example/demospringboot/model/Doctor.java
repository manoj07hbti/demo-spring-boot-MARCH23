package com.example.demospringboot.model;

public class Doctor {
    String name;
    int id ;
    String Speciality;

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
        return id;
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
