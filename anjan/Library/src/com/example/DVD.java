package com.example;

public class DVD extends LibraryItem {
    public String actors;
    public String director;
    public String genre;

    public DVD(String title, String upc, String subject, String actors, String director, String genre) {
        super(title, upc, subject);
        this.actors = actors;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public String locate() {
        return "Locate the DVD featuring actor(s): " + actors + " directed by: " + director;
    }
}

