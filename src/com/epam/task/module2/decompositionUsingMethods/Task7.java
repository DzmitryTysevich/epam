package com.epam.task.module2.decompositionUsingMethods;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Summa: " + calculateSumFactorialOddNumbers(9));
    }

    public static int calculateSumFactorialOddNumbers(int valueForFactorial) {
        int summa = 0;
        int factorial = 0;
        for (int i = 1; i <= valueForFactorial; i++) {
            if (i % 2 != 0) {
                factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                summa += factorial;
            }
        }
        System.out.println("Factorial: " + factorial);
        return summa;
    }
}