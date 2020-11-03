package com.epam.task.module2.decompositionUsingMethods;

public class Task8 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int[] array = {4, 5, 6, 8, 2, 3};
        System.out.printf("Summa1: %d\nSumma2: %d\nSumma3: %d\n", getSumma1(array), getSumma2(array), getSumma3(array));
    }

    public static int getSumma1(int[] array) {
        int summa1 = 0;
        for (int indexNumber = 0; indexNumber <= array.length; indexNumber++) {
            if (indexNumber == 0) {
                summa1 = getFormulaSumma(array, indexNumber);
            }
        }
        return summa1;
    }

    public static int getSumma2(int[] array) {
        int summa2 = 0;
        for (int indexNumber = 0; indexNumber <= array.length; indexNumber++) {
            if (indexNumber == 2) {
                summa2 = getFormulaSumma(array, indexNumber);
            }
        }
        return summa2;
    }

    public static int getSumma3(int[] array) {
        int summa3 = 0;
        for (int indexNumber = 0; indexNumber <= array.length; indexNumber++) {
            if (indexNumber == 3) {
                summa3 = getFormulaSumma(array, indexNumber);
            }
        }
        return summa3;
    }

    public static int getFormulaSumma(int[] array, int i) {
        return array[i] + array[i + 1] + array[i + 2];
    }
}