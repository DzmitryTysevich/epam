package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        calculate(10);
    }

    public static void calculate(int n) {
        int[] a = new int[n];
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100 + 1);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
            else if (a[i]<=min) {
                min=a[i];
                System.out.println(min);
            }
        }

        System.out.println("Array numbers: " + Arrays.toString(a));
        System.out.println(max + " ");
    }
}