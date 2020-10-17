package Branching;

public class Task1 {
    private static int a;
    private static int b;

    public static boolean calculateTriangle(int a, int b) {
        Task1.a=a; Task1.b=b;
        return (Task1.a + Task1.b) < 180;
    }

    public static boolean calculateRectangle() {
        return (a + b) + 90 == 180;
    }

    public static void main(String[] args) {
        System.out.println("Is triangle: " + calculateTriangle(45, 45)+", "+"Is rectangle: " + calculateRectangle());
    }
}