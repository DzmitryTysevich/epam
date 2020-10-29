package com.epam.task.module2.arraysOfArrays;

public class Task16 {
    public static void main(String[] args) {
        int[][] matrix = buildDualArray(3);
        fillMagicMatrixForUneven(matrix);
        printMatrix(matrix);

    }

    public static int[][] buildDualArray(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            }
        }
        return matrix;
    }

    public static void fillMagicMatrixForUneven(int[][] matrix) {
        // 1.Позиция следующего числа вычисляется путем уменьшения номера строки предыдущего числа на 1 и увеличения
        // номера столбца предыдущего числа на 1. В любое время, если вычисленная позиция строки становится -1, она будет
        // перенесена на n- 1. Точно так же, если вычисляемая позиция столбца становится n, она возвращается к 0.
        // 2.Если магический квадрат уже содержит число в вычисленной позиции, вычисляемая позиция столбца будет уменьшена
        // на 2, а вычисленная позиция строки будет увеличена на 1.
        // 3.Если вычисленная позиция строки равна -1, а вычисленная позиция столбца равна n, новая позиция будет: (0, n-2).
        int i = matrix.length / 2; //поиск места
        int j = matrix.length - 1; // где расположена 1

        for (int num = 1; num <= matrix.length * matrix.length; ) {
            if (i == -1 && j == matrix.length) {// третье условие
                i = 0;
                j = matrix.length - 2;
            } else {
                if (i < 0) {               // если следующие число выходит за верхнюю сторону квадрата
                    i = matrix.length - 1; //см. первое условие
                }
                if (j == matrix.length) {  //если следующее число выходит за пределы правой стороны квадрата
                    j = 0;                 //см первое условие
                }
            }
            if (matrix[i][j] != 0) {       //второе условие
                j -= 2;
                i++;
                continue;
            } else {
                matrix[i][j] = num++;
            }
            i--;//первое
            j++;//условие
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}