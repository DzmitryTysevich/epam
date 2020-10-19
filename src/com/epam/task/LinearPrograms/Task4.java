package com.epam.task.LinearPrograms;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(calculate(456.123));
    }

    public static double calculate(double x) {
        return x * 1000 % 1000 + (int) x / 1000.0;
    }
}
