package com.example.demospringboot.controller;

import com.example.demospringboot.controller.service.DBBookService;
import com.example.demospringboot.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DBBookController {
    @Autowired
    DBBookService service;

    @PostMapping("/Add_book")

    public String addBook(@RequestBody Book book) {
        return service.add(book);
    }

    @GetMapping("/get_book")
    public List<Book> getBook() {
        return service.getBook();

    }

    @PutMapping("/book_update/{id}/{name}")
    public String updateBook(@PathVariable Long id, @PathVariable String name) {
        return service.updateBook(id, name);
    }

    @DeleteMapping("/delete_book/{id}")
    public String deleteBook(@PathVariable Long id) {
        return service.deleteBook(id);
    }

    @GetMapping("/get_by_id/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return service.findBookById(id);
    }

    @GetMapping("/find_by_name/{name}")
    public Book getBook(@PathVariable String name) {
        return service.findBookByName(name);
    }

    @GetMapping("/find_by_name_author/{name}/{author}")
    public Book getBook(@PathVariable String name, @PathVariable String author) {
        return service.findBookByNameAuthor(name, author);
    }


}

