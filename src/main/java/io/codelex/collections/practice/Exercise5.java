package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {

    public static Set<Integer> seenNumbers = new HashSet<>();
    public static boolean isHappy = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        while (!seenNumbers.contains(number)) {
            if (number == 1) {
                isHappy = true;
                break;
            }
            seenNumbers.add(number);
            String[] numArr = String.valueOf(number).split("");
            number = 0;
            for (String s : numArr) {
                number += Math.pow(Integer.parseInt(s), 2);
            }
        }
        System.out.println("The value for \"isHappy\" is " + isHappy);
    }

}
