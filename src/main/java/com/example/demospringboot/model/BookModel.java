package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Book_Data")
public class BookModel {
    @Id
    @GeneratedValue
    long id;
    String name;
    String author;
    String subjects;
    int pages;

    public BookModel(String name, String author, String subjects, int pages) {
        this.name = name;
        this.author = author;
        this.subjects = subjects;
        this.pages = pages;
    }

    public BookModel() {
    }

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

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
