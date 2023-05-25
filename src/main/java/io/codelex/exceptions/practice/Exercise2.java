package io.codelex.exceptions.practice;


public class Exercise2 {

    public static void main(String[] args) {

        try {
            methodA();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void methodA() throws ArithmeticException {

        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void methodB() throws ArithmeticException {

        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void methodC() throws ArithmeticException {

        try {
            int val = 1239 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
