package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;
import static com.epam.task.Utils.NumberOperation.*;

public class Task17 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
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
        int amountDigitsFromNumber = getAmountDigitsFromNumber(number);
        int summaDigits = 0;
        int digitFromNumber = 0;
        for (int index = amountDigitsFromNumber - 1; index >= 0; index--) {
            digitFromNumber = number % 10;
            number /= 10;
            summaDigits += digitFromNumber;
        }
        return summaDigits;
    }
}