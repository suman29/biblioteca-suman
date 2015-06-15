package com.twu;

import java.io.BufferedReader;
import java.io.IOException;

public class ReturnBookView {
    private BufferedReader bufferedReader;
    private BooksView booksView;

    public ReturnBookView(BufferedReader bufferedReader, BooksView booksView) {
        this.bufferedReader = bufferedReader;
        this.booksView = booksView;
    }

    public int takeUserInputForReturningBook() {
        try {
            int input = Integer.parseInt(bufferedReader.readLine());
            if (input > 0)
                return input;
            else
                return -1;
        } catch (IOException e) {
            return -1;
        }
    }

    public void displayListOfBooks() {
        booksView.displayListOfBooks();
    }

    public void displayBookReturnedSuccessfully() {
        System.out.println(Messages.RETURN_SUCCESSFUL);
    }

    public void displayMessageWhenBookNotReturnedSuccessfully() {
        System.out.println(Messages.RETURN_NOTSUCCESSFUL);
    }
}
