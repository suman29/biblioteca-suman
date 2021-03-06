package com.twu.actions;

import com.twu.Library;
import com.twu.books.Book;
import com.twu.views.BooksView;
import com.twu.users.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ListBooksActionTest {

    @Mock
    Library library;

    @Mock
    Customer customer;

    @Test
    public void shouldBeAbleToDisplayList() {
        BooksView booksViewStub = mock(BooksView.class);
        ArrayList<Book> book = new ArrayList<>();
        ListBooksAction listBook = new ListBooksAction(book, library);
        listBook.perform(customer);

        verify(library).getAvailableBooks(book);
    }
}
