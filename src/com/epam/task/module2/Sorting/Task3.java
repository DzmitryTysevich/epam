package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;
import com.epam.task.Utils.SwapUtil;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.getRandomArray();
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(getSortedArrayOfSwap(unsortedArray)));

    }

    public static int[] getSortedArrayOfSwap(int[] array) {
        for (int startIndex = array.length - 1; startIndex > 0; startIndex--) {
            for (int sortingIndex = 0; sortingIndex < startIndex; sortingIndex++) {
                if (array[sortingIndex] > array[sortingIndex + 1]) {
                    SwapUtil.swapIntArray(array, sortingIndex, sortingIndex + 1);
                }
            }
        }
        return array;
    }
}