package com.example.demospringboot.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Doctor_Information")
public class Doctor {
    @Id
    @GeneratedValue
    long id;
    String name;
    String specilization;
    int id_num;

    public Doctor(String name, String specilization, int id_num) {
        this.name = name;
        this.specilization = specilization;
        this.id_num = id_num;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    public int getId_num() {
        return id_num;
    }

    public void setId_num(int id_num) {
        this.id_num = id_num;
    }
}
