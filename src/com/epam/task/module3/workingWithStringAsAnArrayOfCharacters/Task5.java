package com.epam.task.module3.workingWithStringAsAnArrayOfCharacters;

public class Task5 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String string = "546 56 wi15  6th   1234  56dfg and    and. Ntrc";
        char[] stringArray = string.toCharArray();
        System.out.println(string);
        System.out.println(getNewArrayWithoutSomeSpace(stringArray));
    }

    public static char[] getNewArrayWithoutSomeSpace(char[] stringArray) {
        char[] newArrayWithoutSomeSpace = new char[getLengthNewArray(stringArray)];
        int tempIndex = 0;
        for (int indexChar = 0; indexChar < stringArray.length; indexChar++) {
            if (stringArray[indexChar] == ' ' && stringArray[indexChar - 1] == ' ') {
                newArrayWithoutSomeSpace[tempIndex] = stringArray[indexChar];
            } else {
                newArrayWithoutSomeSpace[tempIndex] = stringArray[indexChar];
                tempIndex++;
            }
        }
        return newArrayWithoutSomeSpace;
    }

    private static int getLengthNewArray(char[] stringArray) {
        return stringArray.length - getDoubleSpaceCharSum(stringArray);
    }

    private static int getDoubleSpaceCharSum(char[] stringArray) {
        int doubleSpace = 0;
        for (int indexChar = 0; indexChar < stringArray.length; indexChar++) {
            if (stringArray[indexChar] == ' ' && stringArray[indexChar - 1] == ' ') {
                doubleSpace++;
            }
        }
        return doubleSpace;
    }
}