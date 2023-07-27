package com.example.demospringboot.repository;

import com.example.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByRollNo(int roll_no);// select * from table where roll_no=?
    public Student findByRollNoAndName(int roll_no,String name);//select * from table where roll_no=? and name=?

}
