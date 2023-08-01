package com.example.demospringboot.Service;

import org.springframework.stereotype.Service;

@Service
public class All_Service {
    public String BikeService(){
        return "this is my BikeService";
    }
    public String CarService(){
        return "this is my CarService";

    }
    public String FessService(){
        return "this is Fess provide by Student ";

    }

}
