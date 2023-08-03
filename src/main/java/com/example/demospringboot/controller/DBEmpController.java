package com.example.demospringboot.controller;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.service.DBEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DBEmpController {
    // CRUD OPERATION
    // C-create or add data into database
    @Autowired
    DBEmpService service;// here autowired service class
    @PostMapping("/add_empl") // endpoint for add and Assign whole object of model class through @Request body annotation
    public String addemp(@RequestBody Employee employee){
        return service.add_empl(employee);
    }
    // R- RAED  OR GET DATA FROM DATABASE
    @GetMapping("/emp_get_db")// endpoint for get all employees list
    public List<Employee> get_emp(){
        return service.empget();
    }

    // U-UPDATE DATA OF DATABASE
    @PutMapping("/update_emp_db/{id}/{name}")
    public String updateemploy(@PathVariable Long id,@PathVariable String name){
        return service.update_empl(id,name);
    }

    // D- DELETE DATA OF BY EMPLOYEE ID
    @DeleteMapping("/delempl/{id}")
    public String delemp(@PathVariable Long id){
        return service.deleteempl(id);
    }

//    @PutMapping("/updateinstance")
//    public String updateemp(@RequestBody Employee employee){
//        return service.updateemply(employee);
//    }

    @GetMapping("/findbyid/{id}")
    public Optional<Employee> findbyid(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping ("/find_byname/{name}")
    public Employee findbyname(@PathVariable String name){
        return service.findByName(name);
    }
    @GetMapping("/find_byndept/{dept}")
    public Employee findbydept(@PathVariable String dept){
        return service.findByDept(dept);
    }
    @GetMapping("/find_bysalary/{salary}")
    public Employee findbysalary(@PathVariable int salary){

        return service.findBySalary(salary);
    }
    @GetMapping("/find_bynameandidt/{id}/{name}")
    public Employee fndbynameanddept(@PathVariable Long id,@PathVariable String name){
        return service.findByNameAndId(id,name);
    }
    @GetMapping("/find_bynameorsalary/{name}/{salary}")
    public Employee findbynameOrSalary(@PathVariable String name,@PathVariable int salary){
        return service.findByNameOrSalry(name,salary);
    }
    @GetMapping ("/find_bynamenid/{id}/{name}")
    public Employee findbynamenidNative(@PathVariable Long id,@PathVariable String name){
        return service.findByNameAndIdNative(id,name);
    }
    @GetMapping("/get_allempnative")
    public List<Employee> getallempl(){
        return service.findAllEmployeeNative();
    }
    @GetMapping ("/find_bynameNative/{name}")
    public Employee findbyNameNative(@PathVariable String name) {
        return service.findByName(name);

    }
}

