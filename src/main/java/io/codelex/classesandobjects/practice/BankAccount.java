package io.codelex.classesandobjects.practice;


public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        String formattedBalance;
        if (balance >= 0) {
            formattedBalance = String.format("$%.2f", balance);
        } else {
            formattedBalance = String.format("-$%.2f", -balance);
        }
        return name + ", " + formattedBalance;
    }

}
