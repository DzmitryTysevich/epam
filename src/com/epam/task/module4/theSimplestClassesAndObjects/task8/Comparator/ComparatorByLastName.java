package com.epam.task.module4.theSimplestClassesAndObjects.task8.Comparator;

import com.epam.task.module4.theSimplestClassesAndObjects.task8.Customer;

import java.util.Comparator;

public class ComparatorByLastName implements Comparator<Customer> {

    @Override
    public int compare(Customer left, Customer right) {
        return left.getLastName().compareTo(right.getLastName());
    }
}