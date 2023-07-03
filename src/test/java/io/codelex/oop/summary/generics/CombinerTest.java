package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinerTest {

    @Test
    public void basicTest() {
        int first = 1023201;
        String second = "Hello, world!";
        String expectedOutput = "First item: " + first + "; Second item: " + second;

        assertEquals(expectedOutput, Combiner.combineTwoItems(first, second));
    }

    @Test
    public void objectTest() {
        Printer first = new Printer("asdxasf");
        LazyBox<Integer> second = new LazyBox<>(() -> {
            return 5;
        });
        String expectedOutput = "First item: " + first + "; Second item: " + second;

        assertEquals(expectedOutput, Combiner.combineTwoItems(first, second));
    }

}
