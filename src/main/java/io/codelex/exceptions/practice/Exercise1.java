package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the numerator");
                String line = scanner.nextLine();
                if (line.charAt(0) == 'q' || line.charAt(0) == 'Q') {
                    break;
                }
                int numerator = Integer.parseInt(line);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                if (divisor == 0) {
                    throw new ArithmeticException("You can't divide " + numerator + " by 0");
                }
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. \nPlease try again.");
            }

        }
    }
}
