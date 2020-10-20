package com.epam.task.module1.Branching;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(calculateFunction(4));
    }

    public static double calculateFunction(double x) {
        double res;
        if (x <= 3) {
            res = Math.pow(x, 2) - 3 * x + 9;
        } else {
            res = 1 / (Math.pow(x, 3) + 6);
        }
        return res;
    }
}
