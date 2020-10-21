package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        calculateMaxSum(10);
    }

    public static void calculateMaxSum(int n) {

        Random random = new Random();
        int[] a = new int[n];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (random.nextInt(10) + 1);
        }
        int min = a[0];
        for (int j : a) {
            if (j <= min) {
                min = j;
            }
        }
        for (int j : a) {
            if (j > min) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(a));
        int[] b = new int[counter];
        for (int i = 0; i < b.length; i++) {
            if(a[i]!=min){b[i] = a[i];
            a[i]=a[i+1];}


        }
        System.out.println(Arrays.toString(b));
        System.out.println("Min summa: " + min + " " + counter);
    }
}