package com.example.demospringboot.controller;

import com.example.demospringboot.model.Books;
import com.example.demospringboot.service.Books_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Books_Controller {
    @Autowired
    Books_service service;

    @PostMapping("/addBook") //CREATE
    public String addBook(@RequestBody Books book){
        return service.addBook(book);
    }
    @GetMapping("/getBook") // READ
    public List<Books> getBook(){

        return service.getBook();
    }

    @PutMapping("/updateBook/{id}/{name}")
    public String updateBook(@PathVariable Long id,@PathVariable String name){
        return service.updateBook(id,name);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable Long id){
       return service.deleteBook(id);
    }

    @GetMapping("/getBook_By_Name_Author/{name}/{author}") // READ
    public Books findByNameAndAuthor(@PathVariable String name,@PathVariable String author){

        return  service.findByNameAndAuthor(name,author);
    }

    @GetMapping("/getBook_By_Name_Subjects/{name}/{subjects}") // READ
    public Books findByNameAndSubject(@PathVariable String name,@PathVariable String subjects){

        return  service.findByNameAndSubjects(name,subjects);
    }

    @GetMapping("/getBook_By_Name/{name}") // READ
    public Books findByName(@PathVariable String name){

        return  service.findByName(name);
    }
}











