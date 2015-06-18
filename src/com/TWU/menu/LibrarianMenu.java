package com.twu.menu;

import com.twu.Option;
import com.twu.users.Librarian;

import java.util.HashMap;
import java.util.Map;

public class LibrarianMenu {
    HashMap<Integer, String> menuListLibrarian;
    HashMap<Integer, Option> mappedOptionsLibrarian;
    Librarian librarian;

    public LibrarianMenu(HashMap<Integer, String> menuListLibrarian, HashMap<Integer, Option> mappedOptionsLibrarian, Librarian librarian) {
        this.mappedOptionsLibrarian = mappedOptionsLibrarian;
        this.menuListLibrarian = menuListLibrarian;
        this.librarian = librarian;
    }

    public void performAction(int option) {
        mappedOptionsLibrarian.get(option).perform(librarian);
    }

    @Override
    public String toString() {
        String mainMenu = "\n";
        for (Map.Entry m : menuListLibrarian.entrySet()) {
            mainMenu += (m.getKey() + ". " + m.getValue() + System.lineSeparator());
        }
        mainMenu += "Enter your choice:\n\n";
        return mainMenu;
    }

    public boolean isValidInput(int input) {
        return input >= 1 && input <= 3;
    }
}