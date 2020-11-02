package com.epam.task.Utils;

public class NumberOperation {
    public static int[] getSimpleNumbers(int number) {
        int[] array = new int[number];
        for (int index = 1; index < number; index++) {
            if (number % index == 0)
                array[index] = index;
        }
        return array;
    }

    public static int[] getSimpleNumbersOnTheSegment(int startNumber, int endNumber) {
        int[] array = new int[endNumber];
        for (int index = startNumber; index <= endNumber; index++) {
            if (endNumber % index == 0)
                array[index] = index;
        }
        return array;
    }

    public static boolean isMaxOneDivider(int number) {
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }
}