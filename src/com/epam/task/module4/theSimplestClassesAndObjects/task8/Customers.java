package com.epam.task.module4.theSimplestClassesAndObjects.task8;

import com.epam.task.Utils.InputUtil;
import com.epam.task.module4.theSimplestClassesAndObjects.task8.Comparator.ComparatorByLastName;

import java.util.Arrays;

public class Customers {
    private final Customer[] CUSTOMERS;

    public Customers() {
       CUSTOMERS = new Customer[5];
    }

    public Customer[] getCUSTOMERS() {
        CUSTOMERS[0] = new Customer("Petrovich", "Vladimir", "Petrovich", 102);
        CUSTOMERS[1] = new Customer("Ivanovich", "Ivan", "Ivanovich", 101);
        CUSTOMERS[2] = new Customer("Seh", "Serhei", "Dmitrievich", 100);
        CUSTOMERS[3] = new Customer("Vovik", "Dmitry", "Alexandrovich", 103);
        CUSTOMERS[4] = new Customer("Shurin", "Vladimir", "Petrovich", 104);
        return CUSTOMERS;
    }

    public void printCustomersSorted() {
        Arrays.sort(CUSTOMERS, new ComparatorByLastName());
        for (Customer customer : CUSTOMERS) {
            System.out.println(customer);
        }
    }

    public void printCustomersByNumCard() {
        int inputLowValue = InputUtil.getInputValue("Enter low value: ");
        int inputHighValue = InputUtil.getInputValue("Enter high value: ");
        for (Customer customer : CUSTOMERS) {
            if (customer.getNumberCard() >= inputLowValue && customer.getNumberCard() <= inputHighValue)
                System.out.println(customer);
        }
    }
}