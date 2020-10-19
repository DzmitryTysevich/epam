package com.epam.task.Cycles;

public class Task5 {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        char x;
        x = 0;
        for (int i = 1; i <= 255; i++) {
            x = (char) i;
            System.out.println("Char: " + x + " " + " Number: " + i);
        }
    }
}