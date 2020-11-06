package com.epam.task.module3.workingWithStringAsAnArrayOfCharacters;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String string = "Enter new account with 123456 and 789";
        char[] stringArray = string.toCharArray();
        System.out.printf("Sum = %d", getAmountDigits(stringArray));
    }

    public static int getAmountDigits(char[] stringArray) {
        int sum = 0;
        for (int indexChar = 0; indexChar < stringArray.length; indexChar++) {
            if (Character.isDigit(stringArray[indexChar])) {
                sum++;
            }
        }
        return sum;
    }
}