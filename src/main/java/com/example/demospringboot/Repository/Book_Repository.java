package com.example.demospringboot.Repository;

import com.example.demospringboot.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Book_Repository extends JpaRepository<BookModel,Long> {
    public BookModel findByName(String name);
    public BookModel findByNameAndSubjects(String name,String subjects);
    public BookModel findByNameAndAuthor(String name,String author);

}
