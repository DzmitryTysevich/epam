package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;
import com.epam.task.Utils.SwapUtil;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.getRandomArray();
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortToShellArray(unsortedArray)));
    }

    public static int[] sortToShellArray(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int j = right - gap; j >= 0; j -= gap) {
                    if (array[j] > array[j + gap]) {
                        SwapUtil.swapValueArray(array, j, j + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        return array;
    }
}