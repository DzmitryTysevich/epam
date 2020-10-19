package com.epam.task.Cycles;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(calculate(100));
    }

    public static double calculate(double x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}