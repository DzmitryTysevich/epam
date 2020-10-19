package com.epam.task.Cycles;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(calculate(-3, 20, 2.5, -3));
    }

    public static boolean calculate(double a, double b, double h, double x) {
        double y;
        if (x > 2 && a <= x && x <= b) {
            for (double i = x; i <= b; i += h) {
                y = i;
                System.out.println(y);
            }
        } else if (x <= 2 && a <= x && x <= b) {
            for (double i = x; i <= b; i += h) {
                y = i;
                System.out.println(y);
            }
        } else {
            return false;
        }
        return true;
    }
}
