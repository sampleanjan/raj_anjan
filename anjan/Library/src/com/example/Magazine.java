package com.example;


public class Magazine extends LibraryItem {
    public int volume;
    public int issue;

    public Magazine(String title, String upc, String subject, int volume, int issue) {
        super(title, upc, subject);
        this.volume = volume;
        this.issue = issue;
    }

    @Override
    public String locate() {
        return "Locate the magazine with Volume: " + volume + " and Issue: " + issue;
    }
}

