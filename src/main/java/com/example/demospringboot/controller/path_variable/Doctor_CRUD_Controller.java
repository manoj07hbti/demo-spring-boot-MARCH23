package com.example.demospringboot.controller.path_variable;

import com.example.demospringboot.model.Doctor;
import com.example.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Doctor_CRUD_Controller {
    ArrayList<Doctor> doctorArrayList=new ArrayList<>();

    //create
    @RequestMapping("/add_doctor/{id}/{name}/{department}")
    public String add(@PathVariable String name, @PathVariable int id, @PathVariable String department){
        Doctor emp=new Doctor(name,id,department);
        doctorArrayList.add(emp);
        return "doctor added successfully";
    }
    //read
    @RequestMapping("/get_doctor")
    public ArrayList<Doctor>getDoctor(){
        return doctorArrayList;
    }
    @RequestMapping("/update_doctor/{index}/{name}")
    public String updateEmployee(@PathVariable int index,@PathVariable String name){
        Doctor doc = doctorArrayList.get(index);
        doc.setName(name);
        return name+" updated successfully";
    }
    //delete
    @RequestMapping("/delete_doctor/{index}")
    public String deleteEmployee(@PathVariable int index){
        doctorArrayList.remove(index);
        return "doctor removed successfully";
    }
}
