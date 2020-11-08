package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task5 {
    final static String STRING = "Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.";

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        StringBuilder stringBuilder = new StringBuilder(STRING);
        System.out.printf("Result sum 'a': %d", getChangeString(stringBuilder));
    }

    public static int getChangeString(StringBuilder stringBuilder) {
        int sumCharA = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == 'а')
                sumCharA++;
        }
        return sumCharA;
    }
}