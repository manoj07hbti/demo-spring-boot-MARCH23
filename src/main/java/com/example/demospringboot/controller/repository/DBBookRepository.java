package com.example.demospringboot.controller.repository;

import com.example.demospringboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBBookRepository extends JpaRepository<Book,Long> {

    public Book findByName(String name);
    public Book findByNameAndAuthor(String name,String author);

}
