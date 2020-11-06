package com.epam.task.Utils;

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
        return in.next();
    }
}