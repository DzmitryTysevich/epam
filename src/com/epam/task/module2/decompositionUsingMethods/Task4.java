package com.epam.task.module2.decompositionUsingMethods;

import static com.epam.task.Utils.MatrixUtil.getRandomPointsMatrix;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Task4 {
    public static void main(String[] args) {
        double[][] matrix = getRandomPointsMatrix();
        findDistanceBetweenPoints(matrix);
        System.out.println();
    }

    public static void findDistanceBetweenPoints(double[][] array) {
        double maxDistance = 0;
        String firstPoint = null;
        String secondPoint = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                double distance = calculateDistance(array[i][0], array[j + 1][0], array[i][1], array[j + 1][1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    firstPoint = "First point  - {" + array[i][0] + " : " + array[i][1] + "}";
                    secondPoint = "Second point - {" + array[j + 1][0] + " : " + array[j + 1][1] + "}";
                }
            }
        }
        System.out.print(firstPoint);
        System.out.println();
        System.out.print(secondPoint);
    }

    private static double calculateDistance(double x, double x1, double y, double y1) {
        return sqrt(pow(x - x1, 2) + pow(y - y1, 2));
    }
}