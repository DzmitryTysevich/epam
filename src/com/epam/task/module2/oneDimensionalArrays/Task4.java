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
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) - 3;
            if (a[i] >= max) {
                max = a[i];
            } else if (a[i] <= min) {
                min = a[i];
            }
        }
        System.out.println("Array numbers: " + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = min;
            } else if (a[i] == min) {
                a[i] = max;
            }
        }
        System.out.println("Array numbers: " + Arrays.toString(a));
        System.out.println(max + " " + min);
    }
}