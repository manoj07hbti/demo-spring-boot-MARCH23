package com.example.demospringboot.service;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.repository.Stu_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DB_Stu_Service {
    @Autowired
    Stu_Repository repository;
    public String add(Student student){
        repository.save(student); //insert data into db
        return "record inserted successfully";
    }

    public List<Student> getStudents(){

        return repository.findAll();
    }

    public String updateStudents(Long id,String name){
        //step 1 - finding student of update by id
        Student student = repository.getReferenceById(id);

        //Step 2 - updating he name and save to db
        student.setName(name);
        repository.save(student); // it will update the record with provided name
        return "record updated successfully";
    }

    public String delete_Student(Long id){
        repository.deleteById(id);

        return "STUDENT REMOVED SUCCESSFULLY";
    }

}
