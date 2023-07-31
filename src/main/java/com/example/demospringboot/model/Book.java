package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Book_Management")
public class Book {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String author;
    int pages;
    String subject;
    // parameterized constructor

    public Book(String name, String author, int pages, String subject) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.subject = subject;
    }
    // default constructor

    public Book() {
    }
    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
