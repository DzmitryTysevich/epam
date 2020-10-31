package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.InputUtil;

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Result: %d",
                findMaxCommonMultiplyNumber(InputUtil.inPutValue("Enter A: "), InputUtil.inPutValue("Enter B: ")));
    }

    public static int findMaxCommonMultiplyNumber(int numberA, int numberB) {
        int[] arrayA = findSimpleNumbersForA(numberA);
        int[] arrayB = findSimpleNumbersForB(numberB);
        int[] doubleArray = findEqualValue(createCommonSizeForArray(numberA, numberB), arrayA, arrayB);
        return findMaxCommonMultiplyNumber(doubleArray);
    }

    private static int[] findSimpleNumbersForA(int numberA) {
        int[] arrayA = new int[numberA];
        for (int i = 2; i < numberA; i++) {
            if (numberA % i == 0)
                arrayA[i] = i;
        }
        return arrayA;
    }

    private static int[] findSimpleNumbersForB(int numberB) {
        int[] arrayB = new int[numberB];
        for (int i = 2; i < numberB; i++) {
            if (numberB % i == 0)
                arrayB[i] = i;
        }
        return arrayB;
    }

    private static int createCommonSizeForArray(int numberA, int numberB) {
        int size = 0;
        size = Math.min(numberA, numberB);
        return size;
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

    private static int findMaxCommonMultiplyNumber(int[] equalValueArray) {
        int max = equalValueArray[0];
        for (int i = 0; i < equalValueArray.length; i++) {
            if (equalValueArray[i] > max)
                max = equalValueArray[i];
        }
        return max;
    }
}