package LinearPrograms;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(consider(2,3,4));
    }

    public static double consider(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}