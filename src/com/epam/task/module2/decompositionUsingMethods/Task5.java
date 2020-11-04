package com.epam.task.module2.decompositionUsingMethods;

import java.util.Arrays;

import static com.epam.task.Utils.ArrayUtil.getRandomArray;

public class Task5 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int[] array = getRandomArray();
        System.out.println(Arrays.toString(array));
        System.out.println(getPreMaxValue(array, getMaxValue(array)));
    }

    public static int getPreMaxValue(int[] array, int maxValue) {
        int preMaxValue = 0;
        for (int indexNumber = 0; indexNumber < array.length; indexNumber++) {
            if (array[indexNumber] > preMaxValue && array[indexNumber] != maxValue) {
                preMaxValue = array[indexNumber];
            }
        }
        return preMaxValue;
    }

    public static int getMaxValue(int[] array) {
        int maxValue = 0;
        for (int indexNumber = 0; indexNumber < array.length; indexNumber++) {
            if (array[indexNumber] > maxValue) {
                maxValue = array[indexNumber];
            }
        }
        return maxValue;
    }
}