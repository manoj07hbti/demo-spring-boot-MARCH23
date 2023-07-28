package com.example.demospringboot.service;

import com.example.demospringboot.model.Employee;
import com.example.demospringboot.repository.Emp_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Emp_Service {
    @Autowired
    Emp_Repository repository;

    public String add(Employee employee){
        repository.save(employee);
        return "RECORD INSERTED SUCCESSFULLY";
    }

    public List<Employee> getEmp(){
        return repository.findAll();
    }

    public String update_Emp(Long id,String name){
        Employee employee= repository.getReferenceById(id);
        employee.setName(name);
        repository.save(employee);
        return "RECORD INSERTED SUCCESSFULLY";
    }

    public String delete_emp(Long id){
        repository.deleteById(id);
        return "record deleted successfully";
    }

    public Optional<Employee> findByID(long id){
      return  repository.findById(id);
    }

    public Employee find_EmployeeByName(String name){
        return  repository.findByName(name);
    }

    public Employee find_EmployeeByNameAndDepartment(String name,String department){
        return  repository.findByNameAndDepartment(name,department);
    }
}
