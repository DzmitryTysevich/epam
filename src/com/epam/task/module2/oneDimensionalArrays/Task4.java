package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        calculate(10);
    }

    public static void calculate(int n) {
        Random random = new Random();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 3;
        }
        System.out.println("Array numbers: " + Arrays.toString(a));

        int max = a[0];
        int min = a[0];
        for (int j : a) {
            if (j >= max) {
                max = j;
            } else {
                min = j;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = min;
            } else {
                a[i] = max;
            }
        }
        System.out.println("Array numbers: " + Arrays.toString(a));
        System.out.println(max + " " + min);
    }
}