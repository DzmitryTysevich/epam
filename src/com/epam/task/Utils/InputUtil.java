package com.epam.task.Utils;

import java.util.Scanner;

public class InputUtil {
    public static int getInPutValue(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }
}