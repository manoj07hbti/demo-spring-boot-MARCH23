package com.example.demospringboot.repository;

import com.example.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Stu_Repository extends JpaRepository<Student,Long> {

    public  Student findByRollNo(int rollNo); // select * from student where rollNo = ?

    public  Student findByRollNoAndName(int rollNo, String name);

    @Query(value="select * from STUDENT_MARCH where roll_no=:roll_no and section=:section", nativeQuery = true)
    public  Student findStudentNative(int roll_no, String section);


    @Query(value="select * from STUDENT_MARCH ", nativeQuery = true)
    public List<Student> findAllStudentNative();
}
