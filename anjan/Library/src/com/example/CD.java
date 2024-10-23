package com.example;


public class CD extends LibraryItem {
    public String artist;

    public CD(String title, String upc, String subject, String artist) {
        super(title, upc, subject);
        this.artist = artist;
    }

    @Override
    public String locate() {
        return "Locate the CD by artist: " + artist;
    }
}

