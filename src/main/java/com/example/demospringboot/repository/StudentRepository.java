package com.example.demospringboot.repository;

import com.example.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByRollNo(int roll_no);// select * from table where roll_no=?
    public Student findByRollNoAndName(int roll_no,String name);//select * from table where roll_no=? and name=?

  // Select * from STUDENT_MARCH_23 where roll_no:roll_no and section:section

    @Query(value = "Select * from STUDENT_MARCH_23 where roll_no=:roll_no and section=:section",nativeQuery = true)
    public Student findStudentNative(int roll_no,String section);

    @Query(value = "Select * from STUDENT_MARCH_23",nativeQuery = true)
    public List<Student> findAllStudentNative();


}
