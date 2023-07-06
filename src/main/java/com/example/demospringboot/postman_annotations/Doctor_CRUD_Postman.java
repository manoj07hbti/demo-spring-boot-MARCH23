package com.example.demospringboot.postman_annotations;

import com.example.demospringboot.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Doctor_CRUD_Postman {
        ArrayList<Doctor> doctorArrayList=new ArrayList<>();

        //create
        @PostMapping("/add_doctor_post/{id}/{name}/{department}")
        public String add(@PathVariable String name, @PathVariable int id, @PathVariable String department){
            Doctor emp=new Doctor(name,id,department);
            doctorArrayList.add(emp);
            return "doctor added successfully";
        }
        //read
        @GetMapping("/get_doctor_post")
        public ArrayList<Doctor>getDoctor(){

            return doctorArrayList;
        }
        @PutMapping("/update_doctor_post/{index}/{name}")
        public String updateEmployee(@PathVariable int index,@PathVariable String name){
            Doctor doc = doctorArrayList.get(index);
            doc.setName(name);
            return name+" updated successfully";
        }
        //delete

        @DeleteMapping("/delete_doctor_post/{index}")
        public String deleteEmployee(@PathVariable int index){
            doctorArrayList.remove(index);
            return "doctor removed successfully";
        }
}
