package com.example.demospringboot.controller;

import com.example.demospringboot.model.Doctor_Class;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Doctor_Crud_Controller {
    ArrayList<Doctor_Class> DoctorArraylist=new ArrayList<>();

    @RequestMapping("/add_doctor/{Name}/{id}/{Department}")
    public String add(@PathVariable String Name,@PathVariable int id,@PathVariable String Department){
        Doctor_Class emp=new Doctor_Class(Name,id,Department);
        DoctorArraylist.add(emp);
        return "Doctor added successfully";
    }
    @RequestMapping("/get_doctor")
    public ArrayList<Doctor_Class> getDoctorArraylist(){
        return getDoctorArraylist();
    }
    @RequestMapping("/update_doctor/{index}/{Name}")
    public String Emp_update(@PathVariable String Name,@PathVariable int index) {
        Doctor_Class doctorClass = DoctorArraylist.get(index);
        doctorClass.setName(Name);
        return Name +"Update_Successfully";
    }
    @RequestMapping("/delete_Doctor/{index}")
    public String deleteEmp(@PathVariable int index){
        DoctorArraylist.remove(index);
        return "Remove Successfully";

    }

}
