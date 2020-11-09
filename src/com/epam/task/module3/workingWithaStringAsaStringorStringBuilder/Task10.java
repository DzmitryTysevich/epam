package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task10 {
    final static char EXCLAMATIONPOINT = '!';
    final static char QUESTIONMARK = '?';
    final static char POINT = '.';
    final static String STRING = "Строка X состоит из нескольких предложений? Каждое из которых кончается точкой, восклицательным или вопросительным знаком. Определить количество предложений в строке X!";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println(STRING);
        System.out.printf("Amount sentences: %d", getAmountSentences());
    }

    public static int getAmountSentences() {
        return getAmountChar(STRING, EXCLAMATIONPOINT) + getAmountChar(STRING, QUESTIONMARK) + getAmountChar(STRING, POINT);
    }

    private static int getAmountChar(String string, char ch) {
        int amountChar = 0;
        for (int indexChar = 0; indexChar < string.length(); indexChar++) {
            if (string.charAt(indexChar) == ch) {
                indexChar++;
                amountChar++;
            }
        }
        return amountChar;
    }
}