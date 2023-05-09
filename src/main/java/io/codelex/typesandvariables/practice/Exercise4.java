package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter the year you were born:");
        short bornYear = input.nextShort();

        input.close();

        System.out.println("My name is " + name + " and I was born in " + bornYear + '.');

    }

}
