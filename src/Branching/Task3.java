package Branching;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 0, 0, -1, -2));
    }

    public static boolean calculate(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (x1 == 0 && x2 == 0 && x3 == 0) {
            return true;
        } else if (y1 == 0 && y2 == 0 && y3 == 0) {
            return true;
        } else {
            return (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);
        }
    }
}