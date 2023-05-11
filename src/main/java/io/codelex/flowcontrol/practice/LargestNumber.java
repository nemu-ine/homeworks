package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        int highestValue;
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();
        in.close();

        if (num1 < num2 && num3 < num2) {
            highestValue = num2;
        } else if (num1 < num3 && num2 < num3) {
            highestValue = num3;
        } else {
            highestValue = num1;
        }
        System.out.println("The largest number is " + highestValue);
    }

}
