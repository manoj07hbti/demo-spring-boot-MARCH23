package com.example.demospringboot.controller.Postaman_Anotation;

import com.example.demospringboot.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Doctor_CRUD_Postman {

    ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    // C-Creating Data=============================================
    @PostMapping("/AddDr_Details/{id}/{Department}/{Hospital_Name}")
    public ArrayList<Doctor> add (@PathVariable int id, @PathVariable String Department,
                                  @PathVariable String Hospital_Name){
        Doctor dr=new Doctor(id,Department,Hospital_Name);
        doctorArrayList.add(dr);
        return doctorArrayList;
    }

    // Read Data========================================================
    @GetMapping("/Get_DrData")
    public ArrayList<Doctor>ReadDrDetails(){
        return doctorArrayList;
    }

    // Update Data========================================================

    @PutMapping("/Update_DrData/{index}/{Hospital_Name}")
    public ArrayList<Doctor> updateDrData (@PathVariable int index,@PathVariable String Hospital_name){
        Doctor updateDoc=doctorArrayList.get(index);
        updateDoc.setHospital_Name(Hospital_name);
        return doctorArrayList;
    }

    // Delete Data========================================================
    @DeleteMapping("/Delete_DrData/{index}")
    public ArrayList<Doctor> del_DrData(@PathVariable int index){
        doctorArrayList.remove(index);
        return doctorArrayList;
    }

}
