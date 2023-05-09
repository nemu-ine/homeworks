package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();
        if (x % 2 == 1) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("bye!");

    }

}
