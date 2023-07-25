package com.example.demospringboot.service;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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

    public String updateStudent(long id, String name){
        //STEP 1 we need to find which record we want to update

        Student student= repository.getReferenceById(id);
     // STEP 2 we will update the name and again save to DB
        student.setName(name);// changed name
        repository.save(student);// it will update the record with provided name

        return "Data have been updated Successfully ...";

    }


    public String delete( long id){

      repository.deleteById(id);// delete from table where id=?

        return "Student deleted successfully..";
    }

}
