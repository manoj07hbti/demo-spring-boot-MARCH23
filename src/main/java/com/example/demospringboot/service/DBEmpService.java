package com.example.demospringboot.service;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class DBEmpService {
    @Autowired
    EmployeeRepository repository;
    public String add_empl(Employee employee){
        repository.save(employee);
        return "record added successfully";
    }
    public List<Employee> empget(){
        return repository.findAll();  //like select * from table
    }
    public String update_empl(Long id,String name){
        Employee employee=repository.getById(id);  //get employee by id
        employee.setName(name);  //set employee name
        repository.save(employee);//save data in repository or database
        return "successfully updated employee"+name;
    }
    public String deleteempl(Long id){ //we can delete employee by id
        repository.deleteById(id);
        return "employee delete successfully";
    }

//    public String updateemply(Employee employee){
//
//
//         String name= String.valueOf(employee.getName()); //get employee by id
//
//        Employee emp=repository.findByName(name).getName();  //set employee name
//
//        emp.setDept(employee.getDept());
//        emp.setSalary(employee.getSalary());
//        repository.save(emp);//save data in repository or database
//        return "succesfully updated";
//
//    }
    public Optional<Employee> findById(@PathVariable Long id){
        return repository.findById(id);

    }

    public Employee findByName(String name){
        return repository.findByName(name);
    }
    public Employee findByDept(String dept){
        return  repository.findByDept(dept);
    }
    public Employee findBySalary(int salary){
        return repository.findBySalary(salary);
    }
    public Employee findByNameAndId(Long id,String name){
        return findByNameAndId(id,name);
    }
    public Employee findByNameOrSalry(String name,int salary){
        return repository.findByNameOrSalary(name,salary);
    }



}
