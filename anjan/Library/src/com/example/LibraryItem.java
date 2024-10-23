package com.example;

//This abstract class implements the Locatable interface,
// but leaves the implementation of locate() to the subclasses.
public abstract class LibraryItem implements Locatable {
    public String title;
    public String upc;
    public String subject;

    public LibraryItem(String title, String upc, String subject) {
        this.title = title;
        this.upc = upc;
        this.subject = subject;
    } 
}

