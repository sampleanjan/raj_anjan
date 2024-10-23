package com.example;

import java.util.List;

public class Book extends LibraryItem {
    public String isbn;
    public List<Author> authors;
    public String ddsNumber;

    public Book(String title, String upc, String subject, String isbn, List<Author> authors, String ddsNumber) {
        super(title, upc, subject);
        this.isbn = isbn;
        this.authors = authors;
        this.ddsNumber = ddsNumber;
    }

    @Override
    public String locate() {
        return "Locate the book with DDS Number: " + ddsNumber;
    }
}

