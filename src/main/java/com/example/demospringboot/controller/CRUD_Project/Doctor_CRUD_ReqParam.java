package com.example.demospringboot.controller.CRUD_Project;

import com.example.demospringboot.model.Doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Doctor_CRUD_ReqParam {
    ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    //C- Create Data===================================================
    @RequestMapping("/Add_Data")
    public ArrayList<Doctor> addData (@RequestParam int id, @RequestParam String Department,
                                  @RequestParam String Hospital_Name){
        Doctor doc=new Doctor(id,Department,Hospital_Name);
        doctorArrayList.add(doc);
        return doctorArrayList;
    }

    // R- Read Data========================================================
    @RequestMapping("/GetData")
    public ArrayList<Doctor>ReadData(){
        return doctorArrayList;
    }

    // U- Update Data========================================================

    @RequestMapping("/UpdateData")
    public ArrayList<Doctor> updateData (@RequestParam int index,@RequestParam String Hospital_name){
        Doctor updateDoctor=doctorArrayList.get(index);
        updateDoctor.setHospital_Name(Hospital_name);
        return doctorArrayList;
    }

    // D- Delete Data========================================================
    @RequestMapping("/DeleteData")
    public ArrayList<Doctor> delete_Data(@RequestParam int index){
        doctorArrayList.remove(index);
        return doctorArrayList;
    }
}
