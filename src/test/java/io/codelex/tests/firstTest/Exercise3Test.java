package io.codelex.tests.firstTest;

import io.codelex.tests.firstTest.exercise3.Joiner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise3Test {

    @Test
    public void combineIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-=-");
        joiner.join(5, 7, 1, 9, 14, 54726, 1234, 73245);
        assertEquals("5-=-7-=-1-=-9-=-14-=-54726-=-1234-=-73245", joiner.toString());
    }

    @Test
    public void combineStrings() {
        Joiner<String> joiner = new Joiner<>("aaaaa");
        joiner.join("897321", "38912", "0123", "38921");
        assertEquals("897321aaaaa38912aaaaa0123aaaaa38921", joiner.toString());
    }

    @Test
    public void nullTest() {
        Joiner<String> joiner = new Joiner<>(null);
        joiner.join("897321", "38912", "0123", "38921");
        assertEquals("89732138912012338921", joiner.toString());
    }

}
