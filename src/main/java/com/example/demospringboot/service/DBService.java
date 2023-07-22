package com.example.demospringboot.service;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    @Autowired
    StudentRepository repository;
    public String add(Student student){

        repository.save(student); // it will insert data into DB

        return "Record inserted Successfully .....";
    }

    public List<Student> getStudents(){

       return repository.findAll(); // select * from table
    }


}
