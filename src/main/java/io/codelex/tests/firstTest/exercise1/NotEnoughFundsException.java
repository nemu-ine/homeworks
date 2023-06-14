package io.codelex.tests.firstTest.exercise1;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException() {
        super("Not enough funds to withdraw!");
    }
}
