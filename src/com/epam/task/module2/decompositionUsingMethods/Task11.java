package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;

public class Task11 {
    public static void main(String[] args) {
        equalValues(inPutValue("Enter number 1: "), inPutValue("Enter number 2: "));
    }

    public static void equalValues(int number1, int number2) {
        if (findValue(number1) > findValue(number2)) {
            System.out.print("Number1 have max digits");
        } else if (findValue(number1) == findValue(number2)) {
            System.out.print("Digits number1 equally digits number2 ");
        } else {
            System.out.println("Number2 have max digits");
        }
    }

    private static int findValue(int number) {
        int counter = 0;
        int tempValue = 1;
        while (tempValue < number) {
            tempValue *= 10;
            counter++;
        }
        return counter;
    }
}