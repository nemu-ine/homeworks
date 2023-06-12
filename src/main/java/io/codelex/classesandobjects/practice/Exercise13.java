package io.codelex.classesandobjects.practice;

public class Exercise13 {

    public static void main(String[] args) {

        Account mattsAccount = new Account("Matt's account",1000);
        Account myAccount = new Account("My Account",0);
        transfer(mattsAccount, myAccount, 100);
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);
        transfer(a, b, 50);
        transfer(b, c, 25);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
