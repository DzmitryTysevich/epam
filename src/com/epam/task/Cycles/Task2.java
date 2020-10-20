package com.epam.task.Cycles;

public class Task2 {

    public static void main(String[] args) {
        calculate(-8, 50, 2.5, 0);
    }

    public static void calculate(double a, double b, double h, double x) {
        double y;
        if (x > 2) {
            for (double i = a; i <= b; i += h) {
                y = i;
                System.out.println(y);
            }
        }
        if (x <= 2) {
            for (double i = a; i <= b; i += h) {
                y = - i;
                System.out.println(y);
            }
        }
    }
}