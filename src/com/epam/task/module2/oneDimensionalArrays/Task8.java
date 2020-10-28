package com.epam.task.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        int[] randomArray = createRandomArray(9);
        createNewSequency(randomArray);
    }

    public static int[] createRandomArray(int size) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(10) + 1);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static int findMinNumber(int[] array) {

        int min = array[0];
        for (int j : array) {
            if (j <= min) {
                min = j;
            }
        }
        return min;
    }

    private static int findMinCounter(int[] array, int min) {
        int counter = 0;
        for (int j : array) {
            if (j == min) {
                counter++;
            }
        }
        return counter;
    }

    private static void createNewSequency(int[] array) {
        int min = findMinNumber(array);
        int minCounter = findMinCounter(array, min);
        int[] sequency = new int[array.length - minCounter];
        int indexB = 0;
        for (int number : array) {
            if (number != min) {
                sequency[indexB] = number;
                indexB++;
            }
        }
        System.out.println(Arrays.toString(sequency));
    }
}