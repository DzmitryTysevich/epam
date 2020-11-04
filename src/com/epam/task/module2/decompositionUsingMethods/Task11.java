package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.getInPutValue;
import static com.epam.task.Utils.NumberOperation.getAmountDigitsFromNumber;

public class Task11 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        printResultEqualValues(getInPutValue("Enter number 1: "), getInPutValue("Enter number 2: "));
    }

    public static void printResultEqualValues(int number1, int number2) {
        if (getAmountDigitsFromNumber(number1) > getAmountDigitsFromNumber(number2)) {
            System.out.print("Number1 have max digits");
        } else if (getAmountDigitsFromNumber(number1) == getAmountDigitsFromNumber(number2)) {
            System.out.print("Digits number1 equally digits number2 ");
        } else {
            System.out.println("Number2 have max digits");
        }
    }
}