package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;
import static com.epam.task.Utils.NumberOperation.*;

public class Task1 {
    public static void main(String[] args) {
        int numberA = getInPutValue("Enter A: ");
        int numberB = getInPutValue("Enter B: ");
        System.out.printf("Min common multiple: %d", findMinCommonMultipleValue(numberA, numberB));
        System.out.println();
        System.out.printf("Max common divider: %d", findMaxCommonDividerValue(numberA, numberB));
    }

    public static int findMaxCommonDividerValue(int numberA, int numberB) {
        int[] arrayA = getSimpleNumbers(numberA);
        int[] arrayB = getSimpleNumbers(numberB);
        int[] doubleArray = findEqualValue(Math.min(numberA, numberB), arrayA, arrayB);
        return findMaxCommonDividerValue(doubleArray);
    }

    public static int findMinCommonMultipleValue(int numberA, int numberB) {
        return numberA * numberB / findMaxCommonDividerValue(numberA, numberB);
    }

    private static int[] findEqualValue(int size, int[] arrayA, int[] arrayB) {
        int[] equalValueArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (arrayA[i] == arrayB[i] && arrayA[i] != 0) {
                equalValueArray[i] = arrayA[i];
            }
        }
        return equalValueArray;
    }

    private static int findMaxCommonDividerValue(int[] equalValueArray) {
        int max = equalValueArray[0];
        for (int i = 0; i < equalValueArray.length; i++) {
            if (equalValueArray[i] > max)
                max = equalValueArray[i];
        }
        return max;
    }
}