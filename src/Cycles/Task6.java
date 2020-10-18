package Cycles;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        calculate(1,10);
    }
    public static void calculate (int m, int n){
        int [] x = new int[n];
        for (int i = m, j=0; i <=n ; i++, j++) {
            x [j] = i;
        }System.out.println(Arrays.toString(x));
    }
}


