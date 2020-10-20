package com.epam.task.module1.Branching;

public class Task1 {

    public static void calculateTriangle(int a, int b) {
        if ((a + b) < 180) {
            System.out.print("Triangle ");
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("is rectangle");
            } else {
                System.out.println("is not rectangle");
            }
        } else {
            System.out.print("Is not triangle");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        calculateTriangle(90, 30);
    }
}
