package com.twu.books;

import com.twu.Messages;
import com.twu.users.Customer;

import java.util.ArrayList;

// It is the book available in library for checkout.

public class AvailableBook extends Book {
    public AvailableBook(String name, String author, int year, int id) {
        super(name, author, year, id);
    }

    @Override
    public void addItselfToAvailableListOfBookIfApplicable(ArrayList<Book> availableBooks) {
        availableBooks.add(this);
    }

    @Override
    public String getAppropriateMessageOnCheckOutAction() {
        return Messages.CHECKOUT_SUCCESSFUL;
    }

    @Override
    public String getAppropriateMessageOnReturnBookAction() {
        return Messages.BOOK_ALREADY_AVAILABLE;
    }

    public static AvailableBook create(CheckedOutBook checkedOutBook) {
        return new AvailableBook(checkedOutBook.name, checkedOutBook.author, checkedOutBook.year, checkedOutBook.id);
    }

    public void checkOut(ArrayList<Book> allBooks, Customer customer) {
        allBooks.remove(this);
        allBooks.add(CheckedOutBook.create(this, customer));
    }

    @Override
    public void returnBook(ArrayList<Book> list) {

    }

    @Override
    public void addItselfToCheckedOutListOfBooksIfApplicable(ArrayList<Book> checkedoutBooks) {

    }
}
