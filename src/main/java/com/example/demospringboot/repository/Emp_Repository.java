package com.example.demospringboot.repository;

import com.example.demospringboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Emp_Repository extends JpaRepository<Employee,Long> {
}
