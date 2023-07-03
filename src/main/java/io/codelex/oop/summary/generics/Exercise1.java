package io.codelex.oop.summary.generics;


public class Exercise1 {

    public static void main(String[] args) {

        final int[] val = {0};
        LazyBox<Integer> lazyBox = new LazyBox<>(() -> {
            val[0]++;
            return val[0];
        });

        System.out.println(lazyBox.get());
        System.out.println(lazyBox.get());

    }

}
