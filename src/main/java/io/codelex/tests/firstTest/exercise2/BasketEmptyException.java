package io.codelex.tests.firstTest.exercise2;

public class BasketEmptyException extends Exception {
    public BasketEmptyException() {
        super("The basket is empty!");
    }
}
