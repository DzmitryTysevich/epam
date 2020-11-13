package com.epam.task.module4.theSimplestClassesAndObjects.task9;

import com.epam.task.Utils.InputUtil;

public class Main {
    public static void main(String[] args) {
        Books books = new Books();
        books.getBooks();
        int sortNum = InputUtil.getInputValue("-<1> if sort by author\n" +
                "-<2> if sort by publishing house\n" +
                "-<3> if sort by after certain year\n" +
                "Enter number: ");
        switch (sortNum) {
            case 1 -> books.choiceBooksSortedByAuthor();
            case 2 -> books.choiceBooksByPublishingHouse();
            case 3 -> books.choiceBooksByYear();
        }
    }
}