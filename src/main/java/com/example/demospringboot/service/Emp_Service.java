package com.example.demospringboot.service;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.repository.Employee_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Emp_Service {

    @Autowired
    Employee_Repository emp_repository;
    public String add(Employee emp){

        emp_repository.save(emp);// this query insert data into Database

        return "Record inserted successfully";
    }

    public List<Employee> getEmployee(){
        return emp_repository.findAll();  // this method collect all the data from database to read=======================
    }

    public String updateEmp(long id,String name){

        //STEP-1:- This method  will find data from the table=============================================
        Employee employee= emp_repository.getById(id);

        //STEP-2:- This method will update the data in database===========================================
        employee.setName(name);

        // STEP-3 :- This method update the record with provided name
        emp_repository.save(employee);

        return "Update employee data successfully";
    }

    public String delEmp(long id){
        emp_repository.deleteById(id);

        return "Delete employee data successfully";
    }

}
