package com.epam.task.Utils.Matrix;

import java.util.Scanner;

public class InputUtil {
    public static int InPutValue(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }
}