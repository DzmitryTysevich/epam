package Branching;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(calculate(2, 3, 4, 5));
        System.out.println(calculate2(2,3,4,5));
    }

    public static int calculate(int a, int b, int c, int d) {
        return Math.max((Math.min(a, b)), (Math.min(c, d)));
    }
    public static int calculate2(int a, int b, int c, int d) {
        int min;
        int min2;
        int max;
        if(a>b){
           min = b;
        }else {
            min = a;
        }

        if(c>d){
            min2 = d;
        }else {
            min2 = c;
        }
        if(min>min2){
            max = min;
        }else{
            max = min2;
        }
        return max;
    }
}