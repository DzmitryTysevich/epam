package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.getInputValue;
import static com.epam.task.Utils.NumberOperation.getSimpleNumbers;

public class Task1 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int numberA = getInputValue("Enter A: ");
        int numberB = getInputValue("Enter B: ");
        System.out.printf("Min common multiple: %d", getMinCommonMultipleValue(numberA, numberB));
        System.out.println();
        System.out.printf("Max common divider: %d", getMaxCommonDividerValue(numberA, numberB));
    }

    public static int getMaxCommonDividerValue(int numberA, int numberB) {
        int[] arrayA = getSimpleNumbers(numberA);
        int[] arrayB = getSimpleNumbers(numberB);
        int[] doubleArray = getEqualArray(arrayA, arrayB);
        return getMaxCommonDividerValue(doubleArray);
    }

    public static int getMinCommonMultipleValue(int numberA, int numberB) {
        return numberA * numberB / getMaxCommonDividerValue(numberA, numberB);
    }

    private static int[] getEqualArray(int[] arrayA, int[] arrayB) {
        int sizeDoubleArray = Math.min(arrayA.length, arrayB.length);
        int[] equalValueArray = new int[sizeDoubleArray];
        for (int index = 0; index < sizeDoubleArray; index++) {
            if (arrayA[index] == arrayB[index] && arrayA[index] != 0) {
                equalValueArray[index] = arrayA[index];
            }
        }
        return equalValueArray;
    }

    private static int getMaxCommonDividerValue(int[] equalValueArray) {
        int maxValue = equalValueArray[0];
        for (int dividerValue : equalValueArray) {
            if (dividerValue > maxValue)
                maxValue = dividerValue;
        }
        return maxValue;
    }
}