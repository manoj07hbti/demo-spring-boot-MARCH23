package com.example.demospringboot.controller;

import com.example.demospringboot.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Doctor_CRUD {


    ArrayList<Doctor> doctorArrayList=new ArrayList<>();

   //  CRUD
    // C-CRAETE
    @PostMapping("/create_dr/{name}/{specilization}/{id_num}")
    public Doctor create_doctor(@PathVariable String name,@PathVariable String specilization,@PathVariable int id_num){
        return new Doctor( name,specilization,id_num);
    }
    // c-create list of doctor
    @PostMapping("/create_dr_list/{name}/{specilization}/{id_num}")
    public ArrayList<Doctor> create_drlist(@PathVariable String name,@PathVariable String specilization,@PathVariable int id_num){
        Doctor doctor=new Doctor(name,specilization,id_num);
        doctorArrayList.add(doctor);
        return doctorArrayList;

    }
    //R- RAED OR GET LIST OF DOCTOR
    @GetMapping("/get_dr_list")
    public ArrayList<Doctor> getDoctorArrayList(){
        return doctorArrayList;

    }
    // U-UPDATE DOCTOR DATA OR LIST
    @PutMapping("/update_dr/{name}/{index}")
    public String update_doctor(@PathVariable String name,@PathVariable int index){
        Doctor doctor=doctorArrayList.get(index);
        doctor.setName(name);
        return "name update successfully";
    }
    //D- DELETE OR REMOVE DOCTOR DATA OR LIST
    @DeleteMapping("/remove_dr/{index}")
    public String remove_dr(@PathVariable int index){
        doctorArrayList.remove(index);
        return "doctor data deleted successfully";
    }

}
