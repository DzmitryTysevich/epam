package com.epam.task.module1.Cycles;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(calculate(5));
    }

    public static int calculate(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
