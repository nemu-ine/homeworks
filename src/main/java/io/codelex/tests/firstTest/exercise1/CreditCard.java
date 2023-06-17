package io.codelex.tests.firstTest.exercise1;

public class CreditCard extends Card {

    public CreditCard(String number, String owner, short ccv, double balance) {
        super(number, owner, ccv, balance);
    }

    @Override
    public void withdrawBalance(double amount) throws NotEnoughFundsException {
        if (amount > balance) {
            throw new NotEnoughFundsException();
        }
        balance -= amount;
        printWarning();
    }

    @Override
    public void printWarning() {
        if (balance < 100) {
            System.out.println("Warning: Low funds");
        }
    }

}
