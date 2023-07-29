package com.example.demospringboot.repository;

import com.example.demospringboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_Repository extends JpaRepository<Employee,Long> {

    public Employee findByCompany_Name(String company_Name);

    public Employee findBySalaryAndName(int salary,String name);
}
