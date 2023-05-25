package io.codelex.dateandtime.practice;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static final LocalDate LAUNCH_DATE = LocalDate.of(2023, 3, 13);
    public static LocalDate futureDate;
    public static ArrayList<LocalDate> updateList = new ArrayList<>();

    public static void main(String[] args) {

        getFutureDate();
        getUpdateDays();
        System.out.println(updateList);

    }

    public static void getFutureDate() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter year, month, day (ex. 2005 10 23)");
            String[] values = input.nextLine().split(" ");
            futureDate = LocalDate.of(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
            input.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect input format");
        } catch (DateTimeException e) {
            System.out.println("Invalid month/day values");
        }

    }

    public static void getUpdateDays() {
        int dayDifference = calculateDayDifference();
        LocalDate currentDate = LAUNCH_DATE;
        for (int i = 0; i <= dayDifference / 14; i++) {
            updateList.add(currentDate);
            currentDate = currentDate.plusDays(14);
        }
    }

    public static int calculateDayDifference() {
        int days = 0;
        String futureDateString = futureDate.toString();
        LocalDate currentDate = LAUNCH_DATE;
        while (!currentDate.toString().equals(futureDateString)) { //oh god
            days++;
            currentDate = currentDate.plusDays(1);
        }
        return days;
    }

}
