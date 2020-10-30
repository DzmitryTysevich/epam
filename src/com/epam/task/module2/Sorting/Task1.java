package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;
import com.epam.task.Utils.InputUtil;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = ArrayUtil.randomArray();
        int[] array2 = ArrayUtil.randomArray();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        array1 = Arrays.copyOf(array1, array1.length + array2.length);
        swatArray(InputUtil.inPutValue("Enter K: "), array1, array2);
    }

    public static void swatArray(int k, int[] array1, int[] array2) {

        for (int i = 0; i < array2.length; i++) {
            if (i > k) {
                array1[i + array2.length] = array1[i];
            }
        }

        for (int i = k + 1, j = 0; i < array2.length + k + 1; i++, j++) {
            array1[i] = array2[j];
        }
        System.out.println(Arrays.toString(array1));
    }
}