package com.epam.task.module4.theSimplestClassesAndObjects.task9.comparator;

import com.epam.task.module4.theSimplestClassesAndObjects.task9.Book;

import java.util.Comparator;

public class ComparatorByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book left, Book right) {
        return left.getAuthor().compareTo(right.getAuthor());
    }
}