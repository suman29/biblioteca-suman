package com.twu;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AvailableBookTest {
    @Test
    public void shouldBeAbleToAddItselfToListOfAvailableBooks() {
        ArrayList<Book> list = new ArrayList<>();
        AvailableBook availableBook = new AvailableBook("monster", "Ashray", 2015, 9);

        availableBook.addItselfToAvailableListOfBooksIfApplicable(list);

        assertTrue(list.contains(availableBook));
    }

    @Test
    public void shouldBeAbleToConvertAvailableBookToCheckedOutBook() {
        AvailableBook availableBook = new AvailableBook("God", "helpme", 2015, 10);
        CheckedOutBook checkoutBook = new CheckedOutBook("God", "helpme", 2015, 10);

        AvailableBook actualOutput = availableBook.create(checkoutBook);

        assertEquals(actualOutput, checkoutBook);
    }

    @Test
    public void shouldBeAbleToCheckoutItself() {
        ArrayList<Book> list = new ArrayList<>();
        AvailableBook availableBook = new AvailableBook("god", "helpme" ,2013, 1);
        list.add(availableBook);
        availableBook.checkOut(list);

        CheckedOutBook checkedOutBook = (CheckedOutBook) list.get(list.indexOf(availableBook));

        assertTrue(checkedOutBook instanceof  CheckedOutBook);
    }

}