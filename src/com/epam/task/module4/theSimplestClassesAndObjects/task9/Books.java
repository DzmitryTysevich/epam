package com.epam.task.module4.theSimplestClassesAndObjects.task9;

import com.epam.task.Utils.InputUtil;
import com.epam.task.module4.theSimplestClassesAndObjects.task9.comparator.ComparatorByAuthor;

import java.util.Arrays;

public class Books {
    private final Book[] BOOKS;

    public Books() {
        BOOKS = new Book[5];
    }

    public Book[] getBooks() {
        BOOKS[0] = new Book("Robertson", "mayak", 2000);
        BOOKS[1] = new Book("Pechko", "Zarya", 2002);
        BOOKS[2] = new Book("Nehin", "Mir", 1999);
        BOOKS[3] = new Book("Zuk", "Zarya", 1990);
        BOOKS[4] = new Book("De Niro", "Star", 2009);
        return BOOKS;
    }

    public void choiceBooksByPublishingHouse() {
        String choicePubHouse = InputUtil.getInputString("Enter publishing house: ");
        for (Book book : BOOKS) {
            if (book.getPublishing_house().equalsIgnoreCase(choicePubHouse))
                System.out.println(book);
        }
    }

    public void choiceBooksByYear() {
        Integer choicePubHouse = InputUtil.getInputValue("Enter year after which: ");
        for (Book book : BOOKS) {
            if (book.getPublishing_year() > choicePubHouse)
                System.out.println(book);
        }
    }

    public void choiceBooksSortedByAuthor() {
        Arrays.sort(BOOKS, new ComparatorByAuthor());
        for (Book book : BOOKS) {
            System.out.println(book);
        }
    }
}