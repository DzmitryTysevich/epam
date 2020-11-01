package com.epam.task.module2.decompositionUsingMethods;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 8, 2, 3};
        calculateSumma(array);
    }

    public static void calculateSumma(int[] array) {
        int summa1 = 0, summa2 = 0, summa3 = 0;
        for (int i = 0; i <= array.length; i++) {
            if (i == 0) {
                summa1 = createFormulaSumma(array, i);
            }
            if (i == 2) {
                summa2 = createFormulaSumma(array, i);
            }
            if (i == 3) {
                summa3 = createFormulaSumma(array, i);
            }
        }
        System.out.printf("Summa1: %d; Summa2: %d; Summa3: %d", summa1, summa2, summa3);
    }

    public static int createFormulaSumma(int[] array, int i) {
        return array[i] + array[i + 1] + array[i + 2];
    }
}