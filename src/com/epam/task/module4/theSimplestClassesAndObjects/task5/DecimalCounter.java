package com.epam.task.module4.theSimplestClassesAndObjects.task5;

public class DecimalCounter {
    private final Integer startValue;
    private final Integer highValue;
    private final Integer lowValue;
    private final Integer[] incrementCounter;
    private final Integer[] decrementCounter;

    public DecimalCounter(Integer startValue, Integer highValue, Integer lowValue) {
        this.startValue = startValue;
        this.highValue = highValue;
        this.lowValue = lowValue;
        this.incrementCounter = new Integer[Math.abs(highValue - startValue + 1)];
        this.decrementCounter = new Integer[Math.abs(startValue - lowValue + 1)];
    }

    public Integer getStartValue() {
        return startValue;
    }

    public Integer getHighValue() {
        return highValue;
    }

    public Integer getLowValue() {
        return lowValue;
    }

    public Integer[] getIncrementCounter() {
        return incrementCounter;
    }

    public Integer[] getDecrementCounter() {
        return decrementCounter;
    }

    public Integer[] getIncrement(Integer startValue, Integer highValue) {
        if (startValue.equals(highValue)) {
            System.out.println("Increment values equals <Try again!>");
        }
        if (startValue > highValue) {
            System.out.print("Wrong increment input <Try again!>\n");
        } else {
            for (int i = startValue, j = 0; i <= highValue; i++, j++) {
                incrementCounter[j] = i;
            }
        }
        return this.incrementCounter;
    }

    public Integer[] getDecrement(Integer startValue, Integer lowValue) {
        if (startValue.equals(lowValue)) {
            System.out.println("Decrement values equals <Try again!>");
        } else if (startValue < lowValue) {
            System.out.print("Wrong input decrement <Try again!>\n");
        } else {
            for (int i = startValue, j = 0; i >= lowValue; i--, j++) {
                decrementCounter[j] = i;
            }
        }
        return this.decrementCounter;
    }

    public Integer[] getCounterInc() {
        return getIncrementCounter();
    }

    public Integer[] getCounterDec() {
        return getDecrementCounter();
    }
}