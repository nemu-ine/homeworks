package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PositiveNegativeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int val = in.nextInt();
        in.close();

        if (val > 0){
            System.out.println("Number is positive");
        } else if (val < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

    }

}
