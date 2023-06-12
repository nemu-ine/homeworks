package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccount {
    private double annualInterestRate, balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void setAnnualInterestRate(double amount) {
        this.annualInterestRate = amount;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;
        double interest = this.balance * monthlyInterestRate;
        this.balance += interest;
    }

    public static void main(String[] args) {
        double startingBalance, annualInterestRate, totalDeposits, totalWithdrawals, totalInterest;
        int numberOfMonths;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How much money is in the account? ");
        startingBalance = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("How long has the account been opened? ");
        numberOfMonths = scanner.nextInt();

        totalDeposits = 0; totalWithdrawals = 0; totalInterest = 0;
        SavingsAccount account = new SavingsAccount(startingBalance);
        account.setAnnualInterestRate(annualInterestRate);

        for (int i = 1; i <= numberOfMonths; i++) {
            double depositAmount, withdrawalAmount;

            System.out.print("Enter the amount deposited for month: " + i + ": ");
            depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            totalDeposits += depositAmount;

            System.out.print("Enter the amount withdrawn for month: " + i + ": ");
            withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
            totalWithdrawals += withdrawalAmount;

            totalInterest += account.balance * (annualInterestRate / 12);
            account.calculateMonthlyInterest();
        }

        scanner.close();

        System.out.printf("Total deposited: $%.2f\n", totalDeposits);
        System.out.printf("Total withdrawn: $%.2f\n", totalWithdrawals);
        System.out.printf("Interest earned: $%.2f\n", totalInterest);
        System.out.printf("Ending balance: $%.2f\n", account.balance);
    }
}
