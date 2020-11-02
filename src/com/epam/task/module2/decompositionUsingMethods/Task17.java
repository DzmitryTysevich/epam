package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;

public class Task17 {
    public static void main(String[] args) {
        int summaOperations = getSummaOperationsWithNumber(getInPutValue("Enter number: "));
        System.out.printf("Result: %d", summaOperations);
    }

    public static int getSummaOperationsWithNumber(int number) {
        int summaOperations = 0;
        int summaDigits = getSummaDigitsFromNumber(number);
        while (number > 0) {
            number -= summaDigits;
            summaOperations++;
        }
        return summaOperations;
    }

    public static int getSummaDigitsFromNumber(int number) {
        int summaDigits = 0;
        int digitFromNumber = 0;
        for (int index = getAmountDigitsFromNumber(number) - 1; index >= 0; index--) {
            digitFromNumber = number % 10;
            number /= 10;
            summaDigits += digitFromNumber;
        }
        return summaDigits;
    }

    public static int getAmountDigitsFromNumber(int number) {
        int tempNumber = 1;
        int amountDigits = 0;
        while (tempNumber < number) {
            tempNumber *= 10;
            amountDigits++;
        }
        return amountDigits;
    }
}