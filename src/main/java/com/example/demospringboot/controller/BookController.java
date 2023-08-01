package com.example.demospringboot.controller;

import com.example.demospringboot.Service.BookService;
import com.example.demospringboot.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService service;

    @PostMapping("/addBook")
    public String addBook(@RequestBody BookModel bookModel){
        return service.addBook(bookModel);
    }

    @GetMapping("/getBook")
    public List<BookModel> getBook(){
        return service.getBook();
    }

    @PostMapping("/updateBook/{id}/{name}")
    public String updateBook(@PathVariable Long id,@PathVariable String name){
        return service.updateBook(name, id);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable Long id){
        return service.deleteBook(id);
    }

    @GetMapping("/getBook_By_Name/{name}")
    public BookModel findByName(@PathVariable String name){
        return service.findByName(name);

    }

    @GetMapping("/getBook_By_Name_Subjects/{name}/{subjects}")
    public BookModel findByNameAndSubjects(@PathVariable String name,@PathVariable String subjects){
        return service.findByNameAndSubjects(name, subjects);
    }

    @GetMapping("/getBook_By_Name_Author/{Name}/{Author}")
    public BookModel findByNameAndAuthor(@PathVariable String name,@PathVariable String author){
        return service.findByNameAndAuthor(name, author);
    }
}
