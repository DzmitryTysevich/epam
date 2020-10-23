package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        calculate(10);
    }

    public static void calculate(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i] = 0;
                    break;
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < array.length; i += 2) {
            array[counter] = array[i];
            counter++;
            if (i > counter) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array) + " - Result");
    }
}