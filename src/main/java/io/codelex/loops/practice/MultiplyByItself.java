package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        double val;
        int n;

        System.out.print("Input base number : ");
        Scanner in = new Scanner(System.in);
        val = in.nextDouble();
        System.out.print("Input repeat count : ");
        n = in.nextInt();
        in.close();

        for (int i = 1; i <= n; i++) {
          val *= val;
        }

        System.out.println(val);
    }

}
