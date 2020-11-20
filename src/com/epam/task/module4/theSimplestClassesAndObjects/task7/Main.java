package com.epam.task.module4.theSimplestClassesAndObjects.task7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(1.0, 2.0);
        Point pointB = new Point(4.0, 8.0);
        Point pointC = new Point(9.0, 13.0);
        Double sideA = getDistance(pointA, pointB);
        Double sideB = getDistance(pointB, pointC);
        Double sideC = getDistance(pointC, pointA);

        Double medianCrossX = getMedianCross(pointA, pointB, pointC).getX();
        Double medianCrossY = getMedianCross(pointA, pointB, pointC).getY();
        System.out.printf("Medians cross: X %.2f, Y %.2f\n", medianCrossX, medianCrossY);

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Square: " + triangle.getSquare());
    }

    public static Double getDistance(Point point1, Point point2) {
        double distanceX = point2.getX() - point1.getX();
        double distanceY = point2.getY() - point1.getY();
        return sqrt(pow(distanceX, 2) + pow(distanceY, 2));
    }

    public static Point getMedianCross(Point point1, Point point2, Point point3) {
        return new Point((point1.getX() + point2.getX() + point3.getX()) / 3,
                (point1.getY() + point2.getY() + point3.getY()) / 3);
    }
}