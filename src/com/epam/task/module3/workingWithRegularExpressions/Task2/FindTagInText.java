package com.epam.task.module3.workingWithRegularExpressions.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.epam.task.module3.workingWithRegularExpressions.Task2.Main.TEXT;

public class FindTagInText {
    final static String OPEN_TAG = "\\<([^\\/].*?[^\\/])>+";
    final static String CLOSE_TAG = "\\<([\\/].*?[^\\/])>+";
    final static String CONTENT_TAG = "\\>(.*?)<";
    final static String WITHOUT_BODY_TAG = "\\<(.*?[\\/])>";

    public void run() {
        String[] string = TEXT.split("\n");
        for (String textReader : string) {
            getOpenTag(textReader);
            getContentTag(textReader);
            getCloseTag(textReader);
            getTagWithoutBody(textReader);
        }
    }

    private static void getOpenTag(String string) {
        Pattern pattern = Pattern.compile(OPEN_TAG);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.printf("|%s| - Open tag\n", matcher.group());
        }
    }

    private static void getCloseTag(String string) {
        Pattern pattern = Pattern.compile(CLOSE_TAG);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.printf("|%s| - Close tag\n", matcher.group());
        }
    }

    private static void getContentTag(String string) {
        Pattern pattern = Pattern.compile(CONTENT_TAG);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.printf("|%s| - Content between tags\n", matcher.group(1));
        }
    }

    private static void getTagWithoutBody(String string) {
        Pattern pattern = Pattern.compile(WITHOUT_BODY_TAG);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.printf("|%s| - Without body tag\n", matcher.group());
        }
    }
}