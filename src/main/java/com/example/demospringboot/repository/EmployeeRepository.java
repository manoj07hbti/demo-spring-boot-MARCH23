package com.example.demospringboot.repository;

import com.example.demospringboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Optional<Employee> findById(Long id);

    public Employee findByName(String name);
    public Employee findByDept(String dept);
    public Employee findBySalary(int salary); // select *from Employee where= :salary

   // @Query(value = "SELECT * FROM Employee  WHERE name = :name and dept= :dept", nativeQuery = true)
    public Employee findByNameAndId(Long id,String name);

    public Employee findByNameOrSalary(String name,int salary);
}
