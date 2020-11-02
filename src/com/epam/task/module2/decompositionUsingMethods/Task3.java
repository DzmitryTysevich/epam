package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.printf("Square: %.10f", calculateSquareHexagon(getInPutValue("Enter size side: ")));

    }

    public static double calculateSquareHexagon(double sizeSide) {
        return calculateSquareTriangle(sizeSide) * 6;
    }

    private static double calculateSquareTriangle(double sizeSideTriangle) {
        double heightTriangle = Math.sqrt(Math.pow(sizeSideTriangle, 2) - Math.pow((sizeSideTriangle / 2), 2));
        return sizeSideTriangle * heightTriangle * 1 / 2;
    }
}