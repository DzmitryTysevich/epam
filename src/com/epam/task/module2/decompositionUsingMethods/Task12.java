package com.epam.task.module2.decompositionUsingMethods;

import java.util.Arrays;

import static com.epam.task.Utils.InputUtil.*;

public class Task12 {
    public static void main(String[] args) {
        int[] array = createArray(getInPutValue("Enter K: "), getInPutValue("Enter N: "));
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArray(int k, int n) {
        int[] arrayNumbers = new int[k];
        int m = 0;
        int newLengthArray = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            do {
                m++;
            }
            while (findSummaDigitsOfNumber(m) != k);
            if (m < n)
                arrayNumbers[i] = m;
            if (arrayNumbers[i] != 0)
                newLengthArray++;
        }
        return Arrays.copyOf(arrayNumbers, newLengthArray);

    }

    private static int findSummaDigitsOfNumber(int number) {
        int summaDigits = 0;
        int numberLength = findLength(number);
        int[] arrayOfDigits = findDigitsNumber(number);
        for (int i = 0; i < numberLength; i++) {
            summaDigits += arrayOfDigits[i];
        }
        return summaDigits;
    }

    private static int[] findDigitsNumber(int x) {
        int[] array = new int[findLength(x)];
        for (int i = array.length - 1; i >= 0; i--) {
            int numberToArray = x % 10;
            x /= 10;
            array[i] = numberToArray;

        }
        return array;
    }

    private static int findLength(int number) {
        int numberLength = 0;
        int tempNum = 1;
        while (tempNum <= number) {
            tempNum *= 10;
            numberLength++;
        }
        return numberLength;
    }
}