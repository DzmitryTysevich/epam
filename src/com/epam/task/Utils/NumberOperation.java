package com.epam.task.Utils;

public class NumberOperation {
    public static int[] getSimpleNumbers(int number) {
        int[] array = new int[number];
        for (int index = 0, divider = 1; index < number; index++, divider++) {
            if (number % divider == 0)
                array[index] = divider;
        }
        return array;
    }

    public static boolean isMaxOneDivider(int number) {
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
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