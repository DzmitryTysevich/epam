package com.epam.task.module4.theSimplestClassesAndObjects.task1;

import static com.epam.task.module4.theSimplestClassesAndObjects.task1.Test1.*;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setFirst(3);
        test1.setSecond(8);
        printResult(getMaxNumbers(test1.getFirst(), test1.getSecond()));
        printResult(getSumNumbers(test1.getFirst(), test1.getSecond()));
    }
}