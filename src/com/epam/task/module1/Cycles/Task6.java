package com.epam.task.module1.Cycles;

public class Task6 {

    public static void main(String[] args) {
        calculate(1, 20);
    }

    public static void calculate(int m, int n) {
        int i, j;
        for (i = m; i <= n; i++) {
            System.out.print(i + " - delitel: ");
            for (j = 2; j <= i - 1; j++) {
                if (i % j == 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}