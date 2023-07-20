package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Engineer {
    @Id
    @GeneratedValue
    long id;
    String name;
    String company;
    String city;

    public Engineer(String name, String company, String city) {
        this.name = name;
        this.company = company;
        this.city = city;
    }

    public Engineer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
