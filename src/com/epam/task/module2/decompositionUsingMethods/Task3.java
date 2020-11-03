package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;

public class Task3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.printf("Square: %.10f", getSquareHexagon(getInPutValue("Enter size side: ")));
    }

    public static double getSquareHexagon(double sizeSide) {
        return getSquareTriangle(sizeSide) * 6;
    }

    private static double getSquareTriangle(double sizeSideTriangle) {
        double heightTriangle = Math.sqrt(Math.pow(sizeSideTriangle, 2) - Math.pow((sizeSideTriangle / 2), 2));
        return sizeSideTriangle * heightTriangle * 1 / 2;
    }
}