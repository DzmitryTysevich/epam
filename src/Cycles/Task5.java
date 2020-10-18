package Cycles;

public class Task5 {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate(){
        char x;
        x = 0;
        for (int i = 0; i <= 255; i++) {
            x = (char) i;
            System.out.print(x + " ");
        }
    }
}
