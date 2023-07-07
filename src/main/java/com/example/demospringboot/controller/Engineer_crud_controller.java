package com.example.demospringboot.controller;

import com.example.demospringboot.model.Engineer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Engineer_crud_controller {
    ArrayList<Engineer> EngineerArrayList = new ArrayList<>();
   @RequestMapping("/create_engineer/{name}/{age}/{company}/{salary}")
    public String add (@PathVariable String name, @PathVariable int age, @PathVariable String company, @PathVariable int salary){

        Engineer engineer = new Engineer(name,age,company,salary);

        EngineerArrayList.add(engineer);

        return "Engineer Added Successfully";
    }
@RequestMapping("/get_engineer")
    public ArrayList<Engineer>getEngineerArrayList(){
       return EngineerArrayList;

}
@RequestMapping("/update_engineer/{name}/{index}")
    public String update(@PathVariable String name,@PathVariable int index) {
    Engineer engineer = EngineerArrayList.get(index);
    engineer.setName(name);
    return "Name Update Successfully";
}
@RequestMapping("/remove_engineer/{index}")
    public String remove( @PathVariable int index){
       EngineerArrayList.remove(index);
       return "deleted successfully";
}
}
