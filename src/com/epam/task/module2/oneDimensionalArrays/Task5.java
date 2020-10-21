package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        calculate(10);
    }

    public static void calculate(int n) {
        Random random = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) +1;
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Array numbers: " + Arrays.toString(a));
    }
}