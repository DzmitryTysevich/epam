package com.epam.task.module4.theSimplestClassesAndObjects.task1.test1;

import com.epam.task.module4.theSimplestClassesAndObjects.task1.service.Service;

import static com.epam.task.module4.theSimplestClassesAndObjects.task1.util.PrintResult.printIntResult;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setFirst(3);
        test1.setSecond(8);
        printIntResult(Service.getMaxNumbers(test1.getFirst(), test1.getSecond()));
        printIntResult(Service.getSumNumbers(test1.getFirst(), test1.getSecond()));
    }
}