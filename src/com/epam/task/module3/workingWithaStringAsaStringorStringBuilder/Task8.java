package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task8 {
    final static char SPACE = ' ';
    final static char POINT = '.';
    final static String STRING = "Вводится строка слов разделенных разделеннoе пробелами.";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        StringBuilder stringBuilder = new StringBuilder(STRING);
        System.out.println(stringBuilder);
        System.out.printf("Most longer word: %s", getMostLongerWord(stringBuilder));
    }

    public static String getMostLongerWord(StringBuilder stringBuilder) {
        int maxLengthWord = 0;
        int startIndexWord = 0;
        int endIndexWord = 0;
        for (int indexChar = 0; indexChar < stringBuilder.length(); indexChar++) {
            int startIndex = indexChar;
            while (stringBuilder.charAt(indexChar) != SPACE && stringBuilder.charAt(indexChar) != POINT) {
                indexChar++;
                int difference = indexChar - startIndex;
                if (difference > maxLengthWord) {
                    maxLengthWord = difference;
                    startIndexWord = startIndex;
                    endIndexWord = indexChar;
                }
            }
        }
        return stringBuilder.substring(startIndexWord, endIndexWord);
    }
}