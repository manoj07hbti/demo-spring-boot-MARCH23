package com.example.demospringboot.Postman.Annotation;

import com.example.demospringboot.model.Doctor_Class;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Doctor_Crud_postman {
    ArrayList<Doctor_Class> DoctorArraylist=new ArrayList<>();
    @PostMapping("/add_doctor_post/{id}/{Name}/{Department}")
    public String add(@PathVariable String Name,@PathVariable int id,@PathVariable String Department){
        Doctor_Class emp=new Doctor_Class(Name,id,Department);
        DoctorArraylist.add(emp);
        return "Added Successfully";
    }
    @GetMapping("/get_Doctor_post")
    public ArrayList<Doctor_Class> getDoctor(){
        return DoctorArraylist;
    }
    @PutMapping("/update_doctor_post/{index}/{name}")
    public String Update_doctor(@PathVariable String Name,@PathVariable int index){
        Doctor_Class doctor_class=DoctorArraylist.get(index);
        doctor_class.setName(Name);
        return "UpdateSuccessfully";
    }
    @DeleteMapping("/delete_doctor_post/{index}")
    public String delete_doctor(@PathVariable int index){
        DoctorArraylist.remove(index);
        return "DoctorRemoveSuccessfully";
    }
}
