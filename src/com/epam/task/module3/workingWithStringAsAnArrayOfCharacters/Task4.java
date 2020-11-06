package com.epam.task.module3.workingWithStringAsAnArrayOfCharacters;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String string = "54656wi156th 123456dfg and 789dfg and 123 1234565 45 sdgfhsd";
        char[] stringArray = string.toCharArray();
        getAmountDigits(stringArray);
        System.out.printf("Sum numbers: %d", getSumNumbers(getArrayNumbers(stringArray)));
    }

    public static int getSumNumbers(int[] arrayIndex) {
        int amountValue = 1;
        for (int i = 1; i < arrayIndex.length; i++) {
            if (arrayIndex[i] - arrayIndex[i - 1] != 1) {
                amountValue++;
            }
        }
        return amountValue;
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

    public static int[] getArrayNumbers(char[] stringArray) {
        int[] arrayNumbers = new int[getAmountDigits(stringArray)];
        int tempIndex = 0;
        for (int indexChar = 0; indexChar < stringArray.length; indexChar++) {
            if (Character.isDigit(stringArray[indexChar])) {
                arrayNumbers[tempIndex] = indexChar;
                tempIndex++;
            }
        }
        return arrayNumbers;
    }
}