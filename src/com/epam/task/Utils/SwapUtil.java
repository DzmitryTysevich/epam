package com.epam.task.Utils;

public class SwapUtil {
    public static void swapIntArray(int[] arrayToSwap, int index1, int index2) {
        int temp = arrayToSwap[index1];
        arrayToSwap[index1] = arrayToSwap[index2];
        arrayToSwap[index2] = temp;
    }

    public static void swapStringArray(String[] arrayToSwap, int index1, int index2) {
        String temp = arrayToSwap[index1];
        arrayToSwap[index1] = arrayToSwap[index2];
        arrayToSwap[index2] = temp;
    }
}