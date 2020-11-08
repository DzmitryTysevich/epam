package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task4 {
    final static String STRING = "информатика";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(getNewWord(STRING));
    }

    public static String getNewWord(String string) {
        return string.charAt(7) + string.substring(3, 5) + string.charAt(7);
    }
}