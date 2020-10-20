package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        calculate(5);
    }

    public static void calculate(int n) {
        int[] a = {4, 5, 9, 8, 1};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            // a[i] = (int) ((Math.random() * 100 + 1)+(Math.random() * -100 + 1));
            if (a[i] >= max) {
                max = a[i];
            }
            if (a[i] <= min) {
                min = a[i];
            }
        }
        System.out.println("Array numbers: " + Arrays.toString(a));
        System.out.println(max + " " + min);
    }
}