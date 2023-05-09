package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input minutes you want to convert to hours and days");
        long minutes = 0;
        try {
            minutes = input.nextLong();
        } catch (Exception e) {
            System.out.println("You did not enter a valid number.");
            return;
        }
        input.close();
        double days = (double) minutes / (60 * 24);
        double years = days / 365.5;
        System.out.println("Days = " + days + '\n' +
                           "Years = " + years);

    }
}
