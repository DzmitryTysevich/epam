package com.epam.task.module1.Cycles;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        calculate(200);
    }

    public static void calculate(int x) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println(result);
    }
}