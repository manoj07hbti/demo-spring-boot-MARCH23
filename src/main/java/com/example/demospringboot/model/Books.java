package com.example.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="BOOKS_MANAGEMENT")
public class Books {

    @Id
    @GeneratedValue
    long id;
    String name;
    String author;
    int pages;
    String subjects;

    public Books() {
    }

    public Books(String name, String author, int pages, String subjects) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.subjects = subjects;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
