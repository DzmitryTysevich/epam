package com.epam.task.module2.Sorting;

import com.epam.task.Utils.Matrix.ArrayUtil;
import com.epam.task.Utils.Matrix.SwapUtil;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.randomArray();
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortSwapArray(unsortedArray)));

    }

    public static int[] sortSwapArray(int[] arrayToSort) {
        for (int i = arrayToSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    SwapUtil.swapValueArray(arrayToSort, j, j + 1);
                }
            }
        }
        return arrayToSort;
    }
}