package io.codelex.classesandobjects.practice;

public class DateTest {

    public static void main(String[] args) {

        Date date = new Date(2023, 5, 16);
        date.displayDate();

        date.setYear(5000);
        date.setMonth(16);
        date.setDay(35);

        date.displayDate();

    }

}
