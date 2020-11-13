package com.epam.task.module4.theSimplestClassesAndObjects.task8;

import com.epam.task.Utils.InputUtil;

public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.getCUSTOMERS();
        int sortNum = InputUtil.getInputValue("-<1> if sort by last name\n" +
                "-<2> if sort by last name and interval\n" +
                "Enter number: ");
        switch (sortNum) {
            case 1 -> customers.printCustomersSorted();
            case 2 -> customers.printCustomersByNumCard();
        }


    }
}