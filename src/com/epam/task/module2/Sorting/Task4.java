package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.getRandomArray();
        System.out.println(Arrays.toString(unsortedArray));
        sortToInsertArray(unsortedArray);
    }

    public static void sortToInsertArray(int[] array) {
        for (int startIndex = 0; startIndex < array.length; startIndex++) {
            int tempValue = array[startIndex];
            int indexLocation = startIndex - 1;
            while (indexLocation >= 0 && array[indexLocation] > tempValue) {
                array[indexLocation + 1] = array[indexLocation];
                indexLocation--;
            }
            array[indexLocation + 1] = tempValue;
        }
        System.out.println(Arrays.toString(array));
    }
}