package com.epam.task.module1.Cycles;

public class Task7 {

    public static void main(String[] args) {
        calculate(142853, 4681);
    }

    public static void calculate(int a, int b) {
        int k, z;
        System.out.print("Common number: ");
        for (int i = a; i > 0; i /= 10) {
            k = i % 10;
            for (int j = b; j > 0; j /= 10) {
                z = j % 10;
                if (k == z)
                    System.out.print(z + ", ");
            }
        }
    }
}