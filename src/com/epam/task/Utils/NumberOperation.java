package com.epam.task.Utils;

public class NumberOperation {
    public static int[] searchSimpleNumbers(int number) {
        int[] array = new int[number];
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                array[i] = i;
        }
        return array;
    }

    public static boolean isMaxOneDivider(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}