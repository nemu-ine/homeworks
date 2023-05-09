package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        input.close();
        System.out.println( ( x == 15 || y == 15 || x+y == 15 || x - y == 15 || y - x == 15) );

    }

}
