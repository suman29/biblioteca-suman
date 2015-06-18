package com.twu.librarianActions;

import com.twu.Library;
import com.twu.Option;
import com.twu.books.Book;
import com.twu.users.User;

public class CheckedOutBooksAction implements Option {
    private Library library;
    private LibrarianActionView librarianActionView;

    public CheckedOutBooksAction(Library library, LibrarianActionView librarianActionView) {

        this.library = library;
        this.librarianActionView = librarianActionView;
    }

    @Override
    public void perform(User customer) {
        String bookName = librarianActionView.takeUserInputToGetDetailsOfItem();
        Book book = library.bookSearcher(bookName);
        System.out.println(book.toString());
    }
}
