package com.epam.task.module4.theSimplestClassesAndObjects.task6;

import com.epam.task.Utils.InputUtil;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(12, 15, 40);
        System.out.println("Current time: " + time.getHour() + " hour " +
                time.getMinute() + " min " + time.getSecond() + " sec");
        time.setHour(InputUtil.getInputValue("Enter hour: "));
        time.setMinute(InputUtil.getInputValue("Enter minute: "));
        time.setSecond(InputUtil.getInputValue("Enter second: "));
        System.out.println("Changed time: " + time.getHour() + " hour " +
                time.getMinute() + " min " + time.getSecond() + " sec");
    }
}