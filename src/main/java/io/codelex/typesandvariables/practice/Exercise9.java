package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float distance = input.nextFloat();
        int hour = input.nextInt();
        byte minutes = input.nextByte();
        byte seconds = input.nextByte();
        int convertedSeconds = hour * 60 * 60 + minutes * 60 + seconds;

        System.out.println("m/s = " + distance / convertedSeconds + '\n' +
                           "km/h = " + (distance / 1000) / ( (float) convertedSeconds / 3600));
        System.out.printf("miles/h = %.8f\n", (distance / 1609) / ((float) convertedSeconds / 3600));
    }

}
