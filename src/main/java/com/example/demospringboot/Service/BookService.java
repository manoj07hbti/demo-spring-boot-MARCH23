package com.example.demospringboot.Service;

import com.example.demospringboot.Repository.Book_Repository;
import com.example.demospringboot.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    Book_Repository repository;

    public String addBook(BookModel bookModel) {
        repository.save(bookModel);
        return "Data inserted Successfully";
    }

    public List<BookModel> getBook() {
        return repository.findAll();
    }

    public String updateBook(String name, Long id) {
        BookModel bookModel=repository.getReferenceById(id);
        bookModel.setName(name);
        repository.save(bookModel);
        return "Update data Successfully";

    }

    public String deleteBook(Long id){
        repository.deleteById(id);
        return "Delete Data Successfully";
    }
    public BookModel findByName(String name){
        return repository.findByName(name);
    }
    public BookModel findByNameAndSubjects(String name,String subjects){
        return repository.findByNameAndSubjects(name,subjects);
    }
    public BookModel findByNameAndAuthor(String name,String author){
        return repository.findByNameAndAuthor(name,author);

    }
}
