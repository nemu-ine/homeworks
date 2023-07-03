package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {

    public static final int hours = 8;

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 5, 1);
        LocalDate endDate = LocalDate.of(2023, 5, 31);
        System.out.println(calculateWorkDays(startDate, endDate) * hours);
    }

    public static int calculateWorkDays(LocalDate startDate, LocalDate endDate) {
        int days = 0;
        while (startDate.isBefore(endDate) || startDate.isEqual(endDate)) {
            if (startDate.getDayOfWeek() != DayOfWeek.SATURDAY && startDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                days++;
            }
            startDate = startDate.plusDays(1);
        }
        return days;
    }

}
