package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;
import static com.epam.task.Utils.NumberOperation.*;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int numberA = getInPutValue("Enter A: ");
        int numberB = getInPutValue("Enter B: ");
        int numberC = getInPutValue("Enter C: ");
        int numberD = getInPutValue("Enter D: ");
        System.out.printf("Max common divider: %d", getMaxCommonDividerValue(numberA, numberB, numberC, numberD));
    }

    public static int getMaxCommonDividerValue(int numberA, int numberB, int numberC, int numberD) {
        int[] arrayA = getSimpleNumbers(numberA);
        int[] arrayB = getSimpleNumbers(numberB);
        int[] arrayC = getSimpleNumbers(numberC);
        int[] arrayD = getSimpleNumbers(numberD);
        int[] doubleArray = getEqualValue(arrayA, arrayB, arrayC, arrayD);
        return getMaxCommonDividerValue(doubleArray);
    }

    private static int[] getEqualValue(int[] arrayA, int[] arrayB, int[] arrayC, int[] arrayD) {
        int minSize = Math.min(Math.min(arrayA.length, arrayB.length), Math.min(arrayC.length, arrayD.length));
        int[] equalValueArray = new int[minSize];
        for (int index = 0; index < minSize; index++) {
            if (arrayA[index] == arrayB[index] && arrayC[index] == arrayD[index] && arrayA[index] == arrayD[index] &&
                    arrayA[index] != 0 && arrayC[index] != 0) {
                equalValueArray[index] = arrayA[index];
            }
        }
        return equalValueArray;
    }

    private static int getMaxCommonDividerValue(int[] equalValueArray) {
        int maxValue = equalValueArray[0];
        for (int dividerValue = 0; dividerValue < equalValueArray.length; dividerValue++) {
            if (equalValueArray[dividerValue] > maxValue)
                maxValue = equalValueArray[dividerValue];
        }
        return maxValue;
    }
}