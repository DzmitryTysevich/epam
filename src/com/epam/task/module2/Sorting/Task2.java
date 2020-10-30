package com.epam.task.module2.Sorting;

import com.epam.task.Utils.Matrix.ArrayUtil;
import com.epam.task.Utils.Matrix.SwapUtil;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.randomArray();
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortChoiceArray(unsortedArray)));
    }

    public static int[] sortChoiceArray(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            int indexMin = i;
            for (int j = i; j < arrayToSort.length; j++) {
                if (arrayToSort[indexMin] > arrayToSort[j]) {
                    indexMin = j;
                }
            }
            SwapUtil.swapValueArray(arrayToSort, i, indexMin);
        }
        return arrayToSort;
    }
}