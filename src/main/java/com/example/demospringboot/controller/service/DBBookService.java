package com.example.demospringboot.controller.service;

import com.example.demospringboot.controller.repository.DBBookRepository;
import com.example.demospringboot.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DBBookService {
    @Autowired
    DBBookRepository repository;


    public String add(Book book) {
        repository.save(book);
        return "Recorded inserted Successfully...";
    }

    public List<Book> getBook() {
        return repository.findAll();
    }

    public String updateBook(Long id, String name) {
        Book book = repository.getReferenceById(id);
        book.setName(name);
        repository.save(book);
        return "Book Data update Successfully";
    }

    public String deleteBook(Long id) {
        repository.deleteById(id);
        return "Book Object deleted successfully";
    }

    public Optional<Book> findBookById(Long id) {
        return repository.findById(id);

    }

    public Book findBookByName(String name) {
        return repository.findByName(name);
    }

    public Book findBookByNameAuthor(String name, String author) {
        return repository.findByNameAndAuthor(name, author);

    }
}