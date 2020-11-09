package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task9 {
    final static String STRING = "Вводится строка. AmoUnt upper Char.";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(STRING);
        System.out.printf("Amount upper char: %d\n", getAmountUpperChar());
        System.out.printf("Amount lower char: %d", getAmountLowerChar());
    }

    public static int getAmountUpperChar() {
        int amountUpperChar = 0;
        for (int indexChar = 0; indexChar < Task9.STRING.length(); indexChar++) {
            if (Task9.STRING.charAt(indexChar) >= 'A' && Task9.STRING.charAt(indexChar) <= 'Z') {
                indexChar++;
                amountUpperChar++;
            }
        }
        return amountUpperChar;
    }

    public static int getAmountLowerChar() {
        int amountLowerChar = 0;
        for (int indexChar = 0; indexChar < Task9.STRING.length(); indexChar++) {
            if (Task9.STRING.charAt(indexChar) >= 'a' && Task9.STRING.charAt(indexChar) <= 'z') {
                amountLowerChar++;
            }
        }
        return amountLowerChar;
    }
}