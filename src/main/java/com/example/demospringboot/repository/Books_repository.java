package com.example.demospringboot.repository;

import com.example.demospringboot.model.Books;
import com.example.demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Books_repository extends JpaRepository<Books,Long> {

    public Books findByNameAndAuthor(String name,String author );

    public Books findByNameAndSubjects(String name,String subjects );

    public Books findByName(String name );
}
