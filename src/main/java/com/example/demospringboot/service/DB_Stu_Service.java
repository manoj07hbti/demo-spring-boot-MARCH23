package com.example.demospringboot.service;

import com.example.demospringboot.model.Student;
import com.example.demospringboot.repository.Stu_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Student> findStudentByID(long id){
        return repository.findById(id);
    }
    public Student findStudentByRollNo(int rollNo){
        return repository.findByRollNo(rollNo);
    }

    public Student findStudentByRollNoName(int rollNo, String name){
        return repository.findByRollNoAndName(rollNo,name);
    }

    public Student findStudentNative(int rollNo, String section){
        return repository.findStudentNative(rollNo,section);
    }

    public List<Student> getStudentByNative(){
        return  repository.findAllStudentNative();
    }

}
