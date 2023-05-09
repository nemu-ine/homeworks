package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4;
        float e = 5;

        int sum = Integer.valueOf(a) + b.intValue() + c + (int) d + (int) e;
        System.out.println(sum); //15
    }

    private static void second() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;

        float sum = (float) Integer.valueOf(a) + (float) b + (float) c + (float) d + e;
        System.out.println(sum); //15.5
    }
}
