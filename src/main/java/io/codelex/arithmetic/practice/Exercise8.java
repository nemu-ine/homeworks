package io.codelex.arithmetic.practice;

public class Exercise8 {

    public static void main(String[] args) {

        double[] Employee1 = {7.50, 35};
        double[] Employee2 = {8.20, 47};
        double[] Employee3 = {10.00, 73};
        calculatePay(Employee1[0], (int) Employee1[1]);
        calculatePay(Employee2[0], (int) Employee2[1]);
        calculatePay(Employee3[0], (int) Employee3[1]);

    }

    public static void calculatePay(double base, int hours) {

        if (base < 8 || hours > 60) {
            System.out.println("Invalid input");
            return;
        }
        int overtime = 0;
        if (hours > 40) {
            System.out.println("Employee pay: " + (base * 40 + (hours - 40) * (base * 1.5)));
            return;
        }
        System.out.println("Employee pay: " + (base * hours));

    }

}
