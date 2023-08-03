package com.example.demospringboot.repository;

import com.example.demospringboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Optional<Employee> findById(Long id);

    public Employee findByName(String name);
    public Employee findByDept(String dept);
    public Employee findBySalary(int salary); // select *from Employee where= :salary

   // @Query(value = "SELECT * FROM Employee  WHERE name = :name and dept= :dept", nativeQuery = true)
    public Employee findByNameAndId(Long id,String name);

    public Employee findByNameOrSalary(String name,int salary);

    // native queries
   // @Query(value = "Select * from tablename where varname1=:varname1 and varname2=:varname2",nativeQuery = true)

    // find Employee by name and id
    @Query(value = "Select *from Employee_Data where id=:id and name=:name",nativeQuery = true)
    public Employee findByNameAndIdNative(Long id,String name);

    // find all Employee
    @Query(value = "Select *from Employee_Data",nativeQuery = true)
    public List<Employee> findAllEmployeeNative();
    // find Employee by name
    @Query(value = "Select *from Employee_Data where name=:name",nativeQuery = true)
    public Employee findByNameNative(String name);
}


