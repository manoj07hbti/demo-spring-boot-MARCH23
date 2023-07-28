package com.example.demospringboot.repository;

import com.example.demospringboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Emp_Repository extends JpaRepository<Employee,Long> {

    public Employee findByName(String name); // select * from table where name =?

    public Employee findByNameAndDepartment(String name,String department);
}
