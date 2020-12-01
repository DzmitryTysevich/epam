package com.epam.task.module5.basicsOfOOP.task5.utils;

import java.util.Locale;
import java.util.Scanner;

public class InputUtil {

    public static int getInputValue(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }

    public static String getInputString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine().toUpperCase(Locale.ROOT);
    }
}