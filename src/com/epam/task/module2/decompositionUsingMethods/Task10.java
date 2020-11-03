package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.InputUtil;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        createArrayNumbers(InputUtil.getInPutValue("Enter number: "));
    }

    public static void createArrayNumbers(int numberN) {
        int[] array = new int[getLengthArray(numberN)];
        for (int indexNumber = array.length - 1; indexNumber >= 0; indexNumber--) {
            int numberToArray = numberN % 10;
            numberN /= 10;
            array[indexNumber] = numberToArray;
        }
        System.out.println(Arrays.toString(array));
    }

    private static int getLengthArray(int numberN) {
        int arrayLength = 0;
        int tempNum = 1;
        while (tempNum <= numberN) {
            tempNum *= 10;
            arrayLength++;
        }
        return arrayLength;
    }
}