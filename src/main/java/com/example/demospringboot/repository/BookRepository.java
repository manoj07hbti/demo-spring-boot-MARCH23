package com.example.demospringboot.repository;

import com.example.demospringboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    //custom method
    public Book findByName(String name);

    public Book findByNameAndAuthor(String name,String author);

    public Book findByNameAndSubject(String name,String subject);

}
