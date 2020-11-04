package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.InputUtil.getInPutValue;
import static java.lang.Math.*;

public class Task9 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int x = getInPutValue("Enter x: ");
        int y = getInPutValue("Enter y: ");
        int z = getInPutValue("Enter z: ");
        int t = getInPutValue("Enter t: ");
        getSquareRectangle(x, y, z, t);
    }

    public static void getSquareRectangle(double sideX, double sideY, double sideZ, double sideT) {
        getSquareTriangle(sideX, sideY, sideZ, sideT);
        double diagonalRectangle = sqrt(pow(sideX, 2) + pow(sideY, 2));
        double radians = ((pow(sideZ, 2) + pow(sideT, 2)) - pow(diagonalRectangle, 2)) / (2 * sideZ * sideT);
        double degreeTriangle = toDegrees(acos(radians));
        if (degreeTriangle < 180) {
            System.out.println((sideX * sideY / 2) + getSquareTriangle(sideX, sideY, sideZ, sideT));
        } else {
            System.out.println((sideX * sideY / 2) - getSquareTriangle(sideX, sideY, sideZ, sideT));
        }
    }

    private static double getSquareTriangle(double x, double y, double z, double t) {
        double sideTriangle = sqrt(pow(x, 2) + pow(y, 2));
        double p = (sideTriangle + z + t) / 2;
        return sqrt(p * (p - sideTriangle) * (p - z) * (p - t));
    }
}