package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.InputUtil;

import static com.epam.task.Utils.NumberOperation.getAmountDigitsFromNumber;

public class Task15 {
    public static void main(String[] args) {
        printNNumber(InputUtil.getInPutValue("Enter n-number: "));
    }

    public static void printNNumber(int endGap) {
        int finderNumber;
        for (int indexNumber = 12; indexNumber <= endGap; indexNumber++) {
            finderNumber = indexNumber;
            if (getNumberWithSequence(indexNumber)) {
                System.out.printf("%d\t", finderNumber);
            }
        }
    }

    private static boolean getNumberWithSequence(int number) {
        int[] arrayNumbers = getArrayDigitsNumber(number);
        for (int indexNumber = 0; indexNumber < arrayNumbers.length - 1; indexNumber++) {
            if (arrayNumbers[indexNumber + 1] - arrayNumbers[indexNumber] != 1) {
                return false;
            }
        }
        return true;
    }

    private static int[] getArrayDigitsNumber(int number) {
        int[] arrayNumbers = new int[getAmountDigitsFromNumber(number)];
        int amountDigitsFromNumber = getAmountDigitsFromNumber(number);
        int digitFromNumber = 0;
        for (int index = amountDigitsFromNumber - 1; index >= 0; index--) {
            digitFromNumber = number % 10;
            number /= 10;
            arrayNumbers[index] = digitFromNumber;
        }
        return arrayNumbers;
    }
}