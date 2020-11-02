package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.InputUtil;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        createArrayNumbers(InputUtil.inPutValue("Enter number: "));

    }

    public static void createArrayNumbers(int n) {
        int[] array = new int[findLength(n)];
        for (int i = array.length - 1; i >= 0; i--) {
            int numberToArray = n % 10;
            n /= 10;
            array[i] = numberToArray;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int findLength(int n) {
        int arrayLength = 0;
        int tempNum = 1;
        while (tempNum <= n) {
            tempNum *= 10;
            arrayLength++;
        }
        return arrayLength;
    }
}