package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.*;
import static java.lang.Math.*;

public class Task9 {
    public static void main(String[] args) {
        int x = getInPutValue("Enter x: ");
        int y = getInPutValue("Enter y: ");
        int z = getInPutValue("Enter z: ");
        int t = getInPutValue("Enter t: ");
        calculateSquareRectangle(x, y, z, t);
    }

    public static void calculateSquareRectangle(double x, double y, double z, double t) {
        calculateSquareTriangle(x, y, z, t);
        double diagonal = sqrt(pow(x, 2) + pow(y, 2));
        double a = ((pow(z, 2) + pow(t, 2)) - pow(diagonal, 2)) / (2 * z * t);
        double degree = toDegrees(acos(a));
        if (degree < 180) {
            System.out.println((x * y / 2) + calculateSquareTriangle(x, y, z, t));
        } else {
            System.out.println((x * y / 2) - calculateSquareTriangle(x, y, z, t));
        }
    }

    private static double calculateSquareTriangle(double x, double y, double z, double t) {
        double diagonal = sqrt(pow(x, 2) + pow(y, 2));
        double p = (diagonal + z + t) / 2;
        return sqrt(p * (p - diagonal) * (p - z) * (p - t));
    }
}