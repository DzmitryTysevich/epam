package com.epam.task.module3.workingWithaStringAsaStringorStringBuilder;

public class Task2 {
    final static String STRING = "В строке вставить после каждого символа а символ b.";

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        StringBuilder stringBuilder = new StringBuilder(STRING);
        System.out.println(getChangeString(stringBuilder));
    }

    public static StringBuilder getChangeString(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == 'а')
                stringBuilder.insert((i + 1), 'b');
        }
        return stringBuilder;
    }
}