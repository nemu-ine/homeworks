package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        System.out.println("Type numbers 0-9 (example: 129213022) \n" +
                           "and it will find the sum of each number.");
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split("");
        input.close();
        int sum = 0;
        for (String x : numbers) {
            sum += Integer.valueOf(x);
        }
        System.out.println(sum);
    }

}
