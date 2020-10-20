package com.epam.task.module1.Branching;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Enter brick: " + calculateAction(8, 10, 5, 4, 2));
    }

    public static boolean calculateAction(int a, int b, int x, int y, int z) {
        return x <= a && y <= b || y <= a && x <= b ||
               x <= a && z <= b || z <= a && x <= b ||
               y <= a && z <= b || z <= a && y <= b;
    }
}