package io.codelex.tests.firstTest.exercise1;

public class DebitCard extends Card {

    public DebitCard(String number, String owner, short ccv, double balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void depositBalance(double amount) {
        balance += amount;
        printWarning();
    }

    @Override
    public void printWarning() {
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
    }
}
