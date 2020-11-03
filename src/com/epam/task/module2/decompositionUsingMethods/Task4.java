package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.MatrixUtil.getRandomPointsMatrix;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Task4 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        double[][] matrix = getRandomPointsMatrix();
        getMaxDistanceBetweenPoints(matrix);
        System.out.println();
    }

    public static void getMaxDistanceBetweenPoints(double[][] array) {
        double maxDistance = 0;
        String firstPoint = null;
        String secondPoint = null;
        for (int linePoints = 0; linePoints < array.length; linePoints++) {
            for (int columnPoints = linePoints; columnPoints < array.length - 1; columnPoints++) {
                double distanceBetweenPoints = getFormulaDistanceBetweenPoints(array[linePoints][0],
                        array[columnPoints + 1][0], array[linePoints][1], array[columnPoints + 1][1]);
                if (distanceBetweenPoints > maxDistance) {
                    maxDistance = distanceBetweenPoints;
                    firstPoint = "First point  - {" + array[linePoints][0] + " : " + array[linePoints][1] + "}";
                    secondPoint = "Second point - {" + array[columnPoints + 1][0] + " : " + array[columnPoints + 1][1] + "}";
                }
            }
        }
        System.out.print(firstPoint);
        System.out.println();
        System.out.print(secondPoint);
    }

    private static double getFormulaDistanceBetweenPoints(double x, double x1, double y, double y1) {
        return sqrt(pow(x - x1, 2) + pow(y - y1, 2));
    }
}