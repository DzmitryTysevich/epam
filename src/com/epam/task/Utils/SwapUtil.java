package com.epam.task.Utils;

public class SwapUtil {
    public static void swapValueArray(int[] arrayToSort, int index1, int index2) {
        int temp = arrayToSort[index1];
        arrayToSort[index1] = arrayToSort[index2];
        arrayToSort[index2] = temp;
    }

    public static void swapStringArray(String[] arrayToSort, int index1, int index2) {
        String temp = arrayToSort[index1];
        arrayToSort[index1] = arrayToSort[index2];
        arrayToSort[index2] = temp;
    }
}