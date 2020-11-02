package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;
import com.epam.task.Utils.SwapUtil;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.getRandomArray();
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(getSortedArrayOfChoice(unsortedArray)));
    }

    public static int[] getSortedArrayOfChoice(int[] array) {
        for (int startIndex = 0; startIndex < array.length - 1; startIndex++) {
            int indexMin = startIndex;
            for (int sortingIndex = startIndex + 1; sortingIndex < array.length; sortingIndex++) {
                if (array[indexMin] > array[sortingIndex]) {
                    indexMin = sortingIndex;
                }
            }
            SwapUtil.swapValueArray(array, startIndex, indexMin);
        }
        return array;
    }
}