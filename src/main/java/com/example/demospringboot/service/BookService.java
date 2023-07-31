package com.example.demospringboot.service;

import com.example.demospringboot.model.Book;
import com.example.demospringboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository repo;

    public String add(Book book){
        repo.save(book);
        return "Book data added successfully";
    }

    public List<Book> getbook(){
        return repo.findAll();// like Query-->select * from table
    }

    public String update(Long id, String name){
        Book book=repo.getReferenceById(id);
        book.setName(name);
        repo.save(book);
        return "book data updated successfully";
    }

    public String deletebook(Long id){
        repo.deleteById(id);
        return "Book object deleted successfully";
    }

    public Book findByName(String name) {
        return repo.findByName(name);
    }

    public Book findByNameAndAuthor(String name,String author){
        return repo.findByNameAndAuthor(name,author);
        }

    public Book findByNameAndSubject(String name,String subject){
        return repo.findByNameAndSubject(name,subject);
    }
}
