package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;
import com.epam.task.Utils.SwapUtil;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.getRandomArray();
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortSwapArray(unsortedArray)));

    }

    public static int[] sortSwapArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    SwapUtil.swapValueArray(array, j, j + 1);
                }
            }
        }
        return array;
    }
}