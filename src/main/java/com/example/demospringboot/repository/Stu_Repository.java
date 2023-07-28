package com.example.demospringboot.repository;

import com.example.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Stu_Repository extends JpaRepository<Student,Long> {

    public  Student findByRollNo(int rollNo); // select * from student where rollNo = ?

    public  Student findByRollNoAndName(int rollNo, String name);

}
