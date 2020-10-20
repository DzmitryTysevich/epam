package com.epam.task.module2.oneDimensionalArrays;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Summa numbers with K: " + calculate(10, 3));
    }

    public static int calculate(int n, int k) {
        int calculatedSum = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            if (a[i] % k == 0) {
                calculatedSum += a[i];
            }
        }
        System.out.println("Massive numbers: " + Arrays.toString(a));
        return calculatedSum;
    }
}