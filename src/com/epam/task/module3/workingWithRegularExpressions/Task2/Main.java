package com.epam.task.module3.workingWithRegularExpressions.Task2;

public class Main {
    final static String TEXT = "<notes>\n" +
            "\n" +
            "   <note id = \"1\">\n" +
            "\n" +
            "       <to>Вася</to>\n" +
            "\n" +
            "       <from>Света</from>\n" +
            "\n" +
            "       <heading>Напоминание</heading>\n" +
            "\n" +
            "       <body>Позвони мне завтра!</body>\n" +
            "\n" +
            "   </note>\n" +
            "\n" +
            "   <note id = \"2\">\n" +
            "\n" +
            "       <to>Петя</to>\n" +
            "\n" +
            "       <from>Маша</from>\n" +
            "\n" +
            "       <heading>Важное напоминание</heading>\n" +
            "\n" +
            "       <body/>\n" +
            "\n" +
            "   </note>\n" +
            "\n" +
            "</notes>";

    public static void main(String[] args) {
        FindTagInText findTagInText = new FindTagInText();
        findTagInText.run();
    }
}