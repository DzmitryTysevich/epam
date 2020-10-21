package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Counter: " + calculate(10, 50));
    }

    public static int calculate(int n, int z) {
        int counter = 0;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            if (a[i] > z) {
                a[i] = z;
                counter++;
            }
        }
        System.out.println("Array numbers with Z: " + Arrays.toString(a));
        return counter;
    }
}
