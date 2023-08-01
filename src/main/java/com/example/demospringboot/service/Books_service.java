package com.example.demospringboot.service;

import com.example.demospringboot.model.Books;
import com.example.demospringboot.repository.Books_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Books_service {

    @Autowired
    Books_repository repository;

    public String addBook(Books book){ //CREATE
        repository.save(book);
        return "RECORD INSERTED SUCCESSFULLY";
    }

    public List<Books> getBook(){ //READ
       return repository.findAll();
    }

    public String updateBook(Long id,String name){  //UPDATE
        Books book= repository.getReferenceById(id);

        book.setName(name);
        repository.save(book);
        return "name updated successfully";
    }

    public String deleteBook(Long id ){  //DELETE
        repository.deleteById(id);
        return "book delete successfully";
    }

    public Books findByNameAndAuthor(String name, String author){
       return  repository.findByNameAndAuthor(name,author);
    }

    public Books findByNameAndSubjects(String name, String subjects){
        return  repository.findByNameAndSubjects(name,subjects);
    }


    public Books findByName(String name){
        return  repository.findByName(name);
    }

}
