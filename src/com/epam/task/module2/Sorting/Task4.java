package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.randomArray();
        System.out.println(Arrays.toString(unsortedArray));
        sortToInsertArray(unsortedArray);
    }

    public static void sortToInsertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int indexLocation = i - 1;
            while (indexLocation >= 0 && array[indexLocation] > value) {
                array[indexLocation + 1] = array[indexLocation];
                indexLocation--;
            }
            array[indexLocation + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}