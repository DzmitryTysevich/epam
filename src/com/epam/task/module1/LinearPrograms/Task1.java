package com.epam.task.module1.LinearPrograms;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(consider(5, 4, 3));
    }

    public static double consider(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}