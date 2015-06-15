package com.twu;

import java.util.ArrayList;

public class AvailableBook extends Book {
    public AvailableBook(String name, String author, int year, int id) {
        super(name, author, year, id);
    }

    @Override
    public void addItselfToAvailableListOfBooksIfAppplicable(ArrayList<Book> availableBooks) {
        availableBooks.add(this);
    }
}