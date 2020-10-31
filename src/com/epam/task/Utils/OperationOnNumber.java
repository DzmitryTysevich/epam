package com.epam.task.Utils;

public class OperationOnNumber {
    public static int[] searchSimpleNumbers(int number) {
        int[] array = new int[number];
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                array[i] = i;
        }
        return array;
    }
}
