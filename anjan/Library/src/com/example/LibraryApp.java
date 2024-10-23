package com.example;
import java.util.Arrays;

public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("Anjan");
        

        Book book = new Book("Life of Bussiness Man", "123456789", "Direct Selling", "888-043977780", Arrays.asList(author1), "995.834");

        Magazine magazine = new Magazine("Life of a Cricketer player", "9987654563", "Sports", 1999, 10);

        DVD dvd = new DVD("Indian Police", "6667890156", "Action", "Sirdarth", "Koratala Siva", "Action");

        CD cd = new CD("Mass", "4656786752", "Music", "DSP");

        System.out.println(book.locate());
        System.out.println(magazine.locate());
        System.out.println(dvd.locate());
        System.out.println(cd.locate());
    }
}