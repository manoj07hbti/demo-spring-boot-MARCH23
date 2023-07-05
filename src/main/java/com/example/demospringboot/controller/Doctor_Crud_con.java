package com.example.demospringboot.controller;

import com.example.demospringboot.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Doctor_Crud_con {


    ArrayList<Doctor> doctorArrayList=new ArrayList<>();
    @RequestMapping("/md_doctor/{name}/{id}/{speciality}")
    public String add (@PathVariable String name, @PathVariable int id,@PathVariable String speciality){

        Doctor doctor = new Doctor(name,id,speciality);
        doctorArrayList.add(doctor);

        return "Doctor Added Successfully .....";

    }
    // c-create list of doctor
    @RequestMapping("/create_doctor/{name}/{id}/{speciality}")
    public ArrayList<Doctor> Create_drList(@PathVariable String name,@PathVariable int id,@PathVariable String speciality) {
        Doctor doctor = new Doctor(name, id, speciality);
        doctorArrayList.add(doctor);
        return doctorArrayList;

    }
   @RequestMapping("/get_Doctors")
    public ArrayList<Doctor>getDoctorArrayList(){
        return doctorArrayList;

    }
  @RequestMapping("/update_doctor/{name}/{index}")
    public String update(@PathVariable String name , @PathVariable int index){

        Doctor doctor = doctorArrayList.get(index);
        doctor . setName(name);
        return "Name update Successfully";
    }
    @RequestMapping("/Remove_doctor/{index}")
    public String remove (int index){
        doctorArrayList.remove(index);
        return "Deleted Successfully....";


    }
}
