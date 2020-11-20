package com.epam.task.module4.theSimplestClassesAndObjects.task6;

public class Time {
    private Integer hour;
    private Integer minute;
    private Integer second;

    public Time(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
        if (this.second >= 60) {
            System.out.println("Wrong input! The second return to <0>");
            this.second = 0;
        }
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
        if (this.minute >= 60) {
            System.out.println("Wrong input! The minute return to <0>");
            this.minute = 0;
        }
    }

    public void setHour(Integer hour) {
        this.hour = hour;
        if (this.hour >= 24) {
            System.out.println("Wrong input! The hour return to <0>");
            this.hour = 0;
        }
    }
}