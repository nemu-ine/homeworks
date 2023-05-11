package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Select a day 0-6 (Sunday...Saturday)");
        int dayNumber = input.nextInt();
        input.close();
        String day = switch (dayNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Not a valid day";
        };
        System.out.println(day);


    }

}
