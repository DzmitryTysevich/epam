package com.epam.task.module2.Sorting;

import com.epam.task.Utils.ArrayUtil;
import com.epam.task.Utils.SwapUtil;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] unsortedArray = ArrayUtil.randomArray();
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortToShellArray(unsortedArray)));
    }

    public static int [] sortToShellArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                SwapUtil.swapValueArray(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        SwapUtil.swapValueArray(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }return array;
    }
}