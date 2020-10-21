package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        calculateMaxSum(10);
    }

    public static void calculateMaxSum(int n) {
        Random random = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(a));

        int max = (a[0] + a[n - 1]);
        for (int j = 0; j < n; j++) {
            int maxJ = a[j] + a[n - 1 - j];
            if (maxJ >= max) {
                max = maxJ;
            }
        }
        System.out.println("Max summa: " + max);
    }
}