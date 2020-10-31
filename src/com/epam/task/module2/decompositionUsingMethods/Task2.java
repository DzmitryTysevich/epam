package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;
import static com.epam.task.Utils.NumberOperation.*;

public class Task2 {
    public static void main(String[] args) {
        int numberA = inPutValue("Enter A: ");
        int numberB = inPutValue("Enter B: ");
        int numberC = inPutValue("Enter C: ");
        int numberD = inPutValue("Enter D: ");
        System.out.printf("Max common divider: %d", findMaxCommonDividerValue(numberA, numberB, numberC, numberD));
    }

    public static int findMaxCommonDividerValue(int numberA, int numberB, int numberC, int numberD) {
        int[] arrayA = searchSimpleNumbers(numberA);
        int[] arrayB = searchSimpleNumbers(numberB);
        int[] arrayC = searchSimpleNumbers(numberC);
        int[] arrayD = searchSimpleNumbers(numberD);
        int minSize = Math.min(Math.min(numberA, numberB), Math.min(numberC, numberD));
        int[] doubleArray = findEqualValue(minSize, arrayA, arrayB, arrayC, arrayD);
        return findMaxCommonDividerValue(doubleArray);
    }

    private static int[] findEqualValue(int size, int[] arrayA, int[] arrayB, int[] arrayC, int[] arrayD) {
        int[] equalValueArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (arrayA[i] == arrayB[i] && arrayC[i] == arrayD[i] && arrayA[i] == arrayD[i] &&
                    arrayA[i] != 0 && arrayC[i] != 0) {
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