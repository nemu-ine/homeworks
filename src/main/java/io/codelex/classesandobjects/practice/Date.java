package io.codelex.classesandobjects.practice;

public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) year = 0;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12) month = 12;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 31) day = 31;
        this.day = day;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
