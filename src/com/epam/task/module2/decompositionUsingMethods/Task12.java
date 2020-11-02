package com.epam.task.module2.decompositionUsingMethods;

import java.util.Arrays;

import static com.epam.task.Utils.InputUtil.*;

public class Task12 {
    public static void main(String[] args) {
        int[] array = getArrayWithNumbers(getInPutValue("Enter K: "), getInPutValue("Enter N: "));
        System.out.println(Arrays.toString(array));
    }

    public static int[] getArrayWithNumbers(int sumNumberK, int numberN) {
        int[] arrayNumbers = new int[sumNumberK];
        int selectionUnknownNumber = 0;
        int newLengthArray = 0;
        for (int numberReader = 0; numberReader < arrayNumbers.length; numberReader++) {
            do {
                selectionUnknownNumber++;
            }
            while (getSummaDigitsOfNumber(selectionUnknownNumber) != sumNumberK);
            if (selectionUnknownNumber < numberN)
                arrayNumbers[numberReader] = selectionUnknownNumber;
            if (arrayNumbers[numberReader] != 0)
                newLengthArray++;
        }
        return Arrays.copyOf(arrayNumbers, newLengthArray);
    }

    private static int getSummaDigitsOfNumber(int unknownNumber) {
        int summaDigits = 0;
        int numberLength = getLengthArray(unknownNumber);
        int[] arrayOfDigits = getDigitsNumber(unknownNumber);
        for (int index = 0; index < numberLength; index++) {
            summaDigits += arrayOfDigits[index];
        }
        return summaDigits;
    }

    private static int[] getDigitsNumber(int unknownNumber) {
        int[] array = new int[getLengthArray(unknownNumber)];
        for (int index = array.length - 1; index >= 0; index--) {
            int numberToArray = unknownNumber % 10;
            unknownNumber /= 10;
            array[index] = numberToArray;

        }
        return array;
    }

    private static int getLengthArray(int unknownNumber) {
        int numberLength = 0;
        int tempNum = 1;
        while (tempNum <= unknownNumber) {
            tempNum *= 10;
            numberLength++;
        }
        return numberLength;
    }
}