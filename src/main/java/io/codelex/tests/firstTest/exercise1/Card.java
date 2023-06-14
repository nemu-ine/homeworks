package io.codelex.tests.firstTest.exercise1;

public abstract class Card {

    String number;
    String owner;
    short ccv;
    double balance;

    public Card(String number, String owner, short ccv, double balance) {
        this.number = number;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public void depositBalance(double amount) {
        balance += amount;
        printWarning();
    }

    public void withdrawBalance(double amount) throws NotEnoughFundsException {
        if (amount > balance) {
            throw new NotEnoughFundsException();
        }
        balance -= amount;
        printWarning();
    }

    public abstract void printWarning();

}
