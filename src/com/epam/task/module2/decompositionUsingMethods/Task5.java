package com.epam.task.module2.decompositionUsingMethods;

import java.util.Arrays;

import static com.epam.task.Utils.ArrayUtil.*;

public class Task5 {
    public static void main(String[] args) {
        int[] array = randomArray();
        System.out.println(Arrays.toString(array));
        System.out.println(findPreMaxValue(array, findMaxValue(array)));
    }

    public static int findMaxValue(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int findPreMaxValue(int[] array, int maxValue) {
        int preMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > preMaxValue && array[i] != maxValue) {
                preMaxValue = array[i];
            }
        }
        return preMaxValue;
    }
}