package com.epam.task.module2.decompositionUsingMethods;

import com.epam.task.Utils.InputUtil;

import static com.epam.task.Utils.NumberOperation.getAmountDigitsFromNumber;
import static java.lang.Math.*;

public class Task14 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        printArmstrongNUmber(InputUtil.getInputValue("Enter endGap: "));
    }

    public static void printArmstrongNUmber(int endGap) {
        int armstrongNumber;
        for (int indexNumber = 1; indexNumber < endGap; indexNumber++) {
            armstrongNumber = indexNumber;
            if (getSummaDigitsInPow(indexNumber) == armstrongNumber) {
                System.out.printf("%d\t", armstrongNumber);
            }
        }
    }

    public static int getSummaDigitsInPow(int unknownArmstrongNumber) {
        int amountDigitsFromNumber = getAmountDigitsFromNumber(unknownArmstrongNumber);
        int summaDigitsInPow = 0;
        int digitFromNumber;
        for (int index = amountDigitsFromNumber - 1; index >= 0; index--) {
            digitFromNumber = unknownArmstrongNumber % 10;
            unknownArmstrongNumber /= 10;
            summaDigitsInPow += pow(digitFromNumber, amountDigitsFromNumber);
        }
        return summaDigitsInPow;
    }
}