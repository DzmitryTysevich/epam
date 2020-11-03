package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;
import static com.epam.task.Utils.NumberOperation.getAmountDigitsFromNumber;

public class Task16 {
    public static void main(String[] args) {
        getAmountEvenNumbersInSummaNumbersWithoutEvenDigits(getInPutValue("Enter n-number: "));
    }

    public static int getAmountEvenNumbersInSummaNumbersWithoutEvenDigits(int endGap) {
        int summaNumberWithoutEvenDigits = getSummaNumbersWithoutEvenDigits(endGap);
        int amountEvenDigitsInSummaNumberWithoutEvenDigits = 0;
        int[] arrayDigitsNumber = getArrayDigitsNumber(summaNumberWithoutEvenDigits);
        for (int digitNumber : arrayDigitsNumber) {
            if (digitNumber % 2 == 0)
                amountEvenDigitsInSummaNumberWithoutEvenDigits++;
        }
        System.out.printf("\nAmount even digits in summa: %d", amountEvenDigitsInSummaNumberWithoutEvenDigits);
        return amountEvenDigitsInSummaNumberWithoutEvenDigits;
    }

    private static int getSummaNumbersWithoutEvenDigits(int endGap) {
        int finderNumber;
        int summaNumberWithoutEvenDigits = 0;
        for (int indexNumber = 1; indexNumber <= endGap; indexNumber++) {
            finderNumber = indexNumber;
            if (isNumberWithOutEvenDigits(indexNumber)) {
                summaNumberWithoutEvenDigits += finderNumber;
                System.out.printf("%d\t", finderNumber);
            }
        }
        System.out.printf("\nSumma numbers: %d", summaNumberWithoutEvenDigits);
        return summaNumberWithoutEvenDigits;
    }

    private static boolean isNumberWithOutEvenDigits(int endGap) {
        int[] arrayDigitsNumber = getArrayDigitsNumber(endGap);
        if (arrayDigitsNumber.length == 1) {
            if (arrayDigitsNumber[0] % 2 == 0) {
                return false;
            }
        }
        for (int indexDigit = 0; indexDigit < arrayDigitsNumber.length - 1; indexDigit++) {
            if (arrayDigitsNumber[indexDigit] % 2 == 0 || arrayDigitsNumber[indexDigit + 1] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] getArrayDigitsNumber(int endGap) {
        int amountDigitsFromNumber = getAmountDigitsFromNumber(endGap);
        int[] arrayDigitNumbers = new int[amountDigitsFromNumber];
        int digitFromNumber;
        for (int index = amountDigitsFromNumber - 1; index >= 0; index--) {
            digitFromNumber = endGap % 10;
            endGap /= 10;
            arrayDigitNumbers[index] = digitFromNumber;
        }
        return arrayDigitNumbers;
    }
}