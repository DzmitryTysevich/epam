package com.epam.task.Utils.Matrix;

public class SwapUtil {
    public static void swapValueArray(int[] arrayToSort, int indexI, int indexJ) {
        int temp = arrayToSort[indexI];
        arrayToSort[indexI] = arrayToSort[indexJ];
        arrayToSort[indexJ] = temp;
    }
}