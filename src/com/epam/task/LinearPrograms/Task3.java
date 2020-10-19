package com.epam.task.LinearPrograms;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(consider(5,8));
    }

    public static double consider(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
