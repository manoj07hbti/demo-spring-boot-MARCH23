package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Ganga_Data")
public class Ganga {
    @Id
    @GeneratedValue
    long id;
    String Name;
    int Num;
    String Place;

    public Ganga(String name, int number, String place) {
        Name = name;
        Num = number;
        Place = place;
    }

    public Ganga() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumber() {
        return Num;
    }

    public void setNumber(int number) {
        Num = number;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }
}
