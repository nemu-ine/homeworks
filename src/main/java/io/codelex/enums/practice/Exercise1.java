package io.codelex.enums.practice;

public class Exercise1 {

    public static void main(String[] args) {

        int i = 0;
        for (Direction x : Direction.values()) {
            System.out.println(x + ":" + Direction.getString(x) + ":" + i);
            i++;
        }

    }

}
