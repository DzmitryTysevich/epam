package com.epam.task.module5.basicsOfOOP.task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar.RelaxDays day1 = new Calendar.RelaxDays(LocalDate.of(2020, 11, 1));
        Calendar.RelaxDays day2 = new Calendar.RelaxDays(LocalDate.of(2020, 11, 2));
        Calendar.RelaxDays day3 = new Calendar.RelaxDays(LocalDate.of(2020, 8, 3));
        day1.setHoliday();
        day2.setDay_off();
        day3.setDay_off();

        Calendar calendar = new Calendar();
        calendar.getRelaxDays().add(day1);
        calendar.getRelaxDays().add(day2);
        calendar.getRelaxDays().add(day3);
        System.out.println(calendar);
    }
}