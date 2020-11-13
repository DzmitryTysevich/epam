package com.epam.task.module4.theSimplestClassesAndObjects.task5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decimal counter:");
        DecimalCounter decimalCounter = new DecimalCounter(10, 20, 0);
        decimalCounter.getIncrement(decimalCounter.getStartValue(), decimalCounter.getHighValue());
        System.out.println(Arrays.toString(decimalCounter.getCounterInc()) + " - increment");

        decimalCounter.getDecrement(decimalCounter.getStartValue(), decimalCounter.getLowValue());
        System.out.println(Arrays.toString(decimalCounter.getCounterDec()) + " - decrement");

        System.out.println("\nAuto decimal counter:");
        Random random = new Random();
        DecimalCounter autoDecimalCounter = new DecimalCounter(random.nextInt(10), random.nextInt(20), random.nextInt(20));
        autoDecimalCounter.getIncrement(autoDecimalCounter.getStartValue(), autoDecimalCounter.getHighValue());
        System.out.println(Arrays.toString(autoDecimalCounter.getCounterInc()) + " - increment");

        autoDecimalCounter.getDecrement(autoDecimalCounter.getStartValue(), autoDecimalCounter.getLowValue());
        System.out.println(Arrays.toString(autoDecimalCounter.getCounterDec()) + " - decrement");
    }
}