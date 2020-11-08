package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task6 {
    final static String STRING = "Из заданной строки получить новую, повторив каждый символ дважды.";

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        StringBuilder stringBuilder = new StringBuilder(STRING);
        System.out.println(getDoubleCharString(stringBuilder));
    }

    public static StringBuilder getDoubleCharString(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i += 2) {
            char charStringBuilder = stringBuilder.charAt(i);
            stringBuilder.insert((i + 1), charStringBuilder);
        }
        return stringBuilder;
    }
}