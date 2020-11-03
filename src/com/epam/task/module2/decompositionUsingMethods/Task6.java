package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;
import static com.epam.task.Utils.NumberOperation.*;

public class Task6 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int number1 = getInPutValue("Enter number 1: ");
        int number2 = getInPutValue("Enter number 2: ");
        int number3 = getInPutValue("Enter number 3: ");
        printResultSimpleNumbersOrNot(number1, number2, number3);
    }

    public static void printResultSimpleNumbersOrNot(int number1, int number2, int number3) {
        if (isMaxOneDivider(number1) && isMaxOneDivider(number2) && isMaxOneDivider(number3)) {
            System.out.println("Result: coprime numbers");
        } else {
            System.out.println("Result: not coprime numbers");
        }
    }
}