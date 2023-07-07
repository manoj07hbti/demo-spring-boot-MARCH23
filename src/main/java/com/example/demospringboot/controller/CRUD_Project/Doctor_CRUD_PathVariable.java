package com.example.demospringboot.controller.CRUD_Project;


import com.example.demospringboot.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

//CRUD===Meaning==(Create,Read,Update,Delete) Definition of Cred Method=======================

@RestController
public class Doctor_CRUD_PathVariable {
    ArrayList<Doctor> doctorArrayList = new ArrayList<>();


    @RequestMapping("/Add/{id}/{Department}/{Hospital_Name}")
    public ArrayList<Doctor> add (@PathVariable int id, @PathVariable String Department,
                                  @PathVariable String Hospital_Name){
        Doctor doc=new Doctor(id,Department,Hospital_Name);
        doctorArrayList.add(doc);
        return doctorArrayList;
    }

    // Read Data========================================================
    @RequestMapping("/Get_Data")
    public ArrayList<Doctor>Read(){
        return doctorArrayList;
    }

    // Update Data========================================================

    @RequestMapping("/Update_Data/{index}/{Hospital_Name}")
    public ArrayList<Doctor> updateData (@PathVariable int index,@PathVariable String Hospital_name){
        Doctor updateDoc=doctorArrayList.get(index);
        updateDoc.setHospital_Name(Hospital_name);
        return doctorArrayList;
    }

    // Delete Data========================================================
    @RequestMapping("/Delete_Data/{index}")
    public ArrayList<Doctor> delete_Data(@PathVariable int index){
        doctorArrayList.remove(index);
        return doctorArrayList;
     }

}
