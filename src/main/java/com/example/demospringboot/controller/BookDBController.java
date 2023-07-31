package com.example.demospringboot.controller;

import com.example.demospringboot.model.Book;
import com.example.demospringboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookDBController {
    @Autowired
    BookService service;
    //CRUD
    //C-CREATE OR POST DATA OF BOOKS
    @PostMapping("/addbook")
    public String addbook(@RequestBody Book book){//here initilized whole object of model class
        return service.add(book);
    }

    //R-READ, GET OR READ DATA OF BOOKS
    @GetMapping("/getbook")
    public List<Book> getbooks(){
       return service.getbook();
    }

    //U-UPDATE, IT MEANS UPDTAE DATA OF BOOK
    @PutMapping("/update_book/{id}/{name}")
    public String update(@PathVariable Long id,@PathVariable String name){
       return service.update(id,name);
    }

    //D-DELETE. IT MEANS DELETE DATA OF BOOK
    @DeleteMapping("/deletebook/{id}")
    public String deletebk(@PathVariable Long id){
        return service.deletebook(id);
    }

    // find by name beacause it is created default method in repository
    @GetMapping("/findbyname/{name}")
    public Book getbynamebk(@PathVariable String name){
        return service.findByName(name);
    }

    // find by name and author
    @GetMapping("/findbynameandauthor/{name}/{author}")
    public Book getbooknamenandauthor(@PathVariable String name,@PathVariable String author){
        return service.findByNameAndAuthor(name,author);
    }

    // find by name and sub
    @GetMapping("/findbynameandsub/{name}/{subject}")
    public Book getbooknamenandsub(@PathVariable String name,@PathVariable String subject){
        return service.findByNameAndSubject(name,subject);
    }

}
