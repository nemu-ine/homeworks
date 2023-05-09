package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Product1ToN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int top = input.nextInt();
        input.close();
        long total = base;
        for (int i = base + 1; i <= top; i++) {
            total *= i;
        }
        System.out.println(total);

    }

}
