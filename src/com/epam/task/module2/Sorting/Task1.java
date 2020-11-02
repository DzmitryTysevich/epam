package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;
import com.epam.task.Utils.InputUtil;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = ArrayUtil.getRandomArray();
        int[] array2 = ArrayUtil.getRandomArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        array1 = Arrays.copyOf(array1, array1.length + array2.length);
        swatArray(InputUtil.getInPutValue("Enter K: "), array1, array2);
    }

    public static void swatArray(int valueK, int[] array1, int[] array2) {

        for (int index = 0; index < array2.length; index++) {
            if (index > valueK) {
                array1[index + array2.length] = array1[index];
            }
        }

        for (int indexI = valueK + 1, indexJ = 0; indexI < array2.length + valueK + 1; indexI++, indexJ++) {
            array1[indexI] = array2[indexJ];
        }
        System.out.println(Arrays.toString(array1));
    }
}