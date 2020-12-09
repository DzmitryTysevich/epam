package com.epam.task.module5.basicsOfOOP.task3;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
import java.util.stream.Collectors;

public class Calendar {
    private final Set<RelaxDays> relaxDays;

    public Calendar() {
        this.relaxDays = new HashSet<>();
    }

    public Set<RelaxDays> getRelaxDays() {
        return relaxDays;
    }

    @Override
    public String toString() {
        return relaxDays.stream()
                .map(RelaxDays::toString)
                .collect(Collectors.joining("\n", "", ""));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(relaxDays, calendar.relaxDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relaxDays);
    }

    public static class RelaxDays {
        private final LocalDate date;
        private boolean isHoliday;
        private boolean isDay_off;

        public RelaxDays(LocalDate date) {
            this.date = date;
            this.isDay_off = false;
            this.isHoliday = false;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setHoliday() {
            isHoliday = true;
        }

        public void setDay_off() {
            isDay_off = true;
        }

        @Override
        public String toString() {
            return "RelaxDay{" +
                    "date=" + date +
                    ", isHoliday=" + isHoliday +
                    ", isDay_off=" + isDay_off +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RelaxDays relaxDays = (RelaxDays) o;
            return Objects.equals(date, relaxDays.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date);
        }
    }
}