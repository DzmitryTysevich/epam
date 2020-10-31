package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.InputUtil;
import com.epam.task.Utils.OperationOnNumber;

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Result: %d",
                findMaxCommonMultiplyValue(InputUtil.inPutValue("Enter A: "), InputUtil.inPutValue("Enter B: ")));
    }

    public static int findMaxCommonMultiplyValue(int numberA, int numberB) {
        int[] arrayA = OperationOnNumber.searchSimpleNumbers(numberA);
        int[] arrayB = OperationOnNumber.searchSimpleNumbers(numberB);
        int[] doubleArray = findEqualValue(Math.min(numberA, numberB), arrayA, arrayB);
        return findMaxCommonMultiplyValue(doubleArray);
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

    private static int findMaxCommonMultiplyValue(int[] equalValueArray) {
        int max = equalValueArray[0];
        for (int i = 0; i < equalValueArray.length; i++) {
            if (equalValueArray[i] > max)
                max = equalValueArray[i];
        }
        return max;
    }
}