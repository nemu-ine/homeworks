package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Your weight: ");
        float weight = input.nextFloat();
        System.out.print("Your height: ");
        float height = input.nextFloat();
        System.out.println("1: Pounds/Inches \n" +
                         "2: Kilograms/Centimeters");
        int choice = input.nextInt();
        while (choice < 1 || choice > 2) {
            System.out.print("Enter a valid number: ");
            choice = input.nextInt();
        }
        input.close();
        double bmi = 0;
        if (choice == 1) {
            bmi = weight * 703 / Math.pow(height, 2);
        } else if (choice == 2) {
            bmi = weight / Math.pow((height / 100), 2);
        }
        if (bmi > 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Optimal");
        } else {
            System.out.println("Underweight");
        }

    }

}
