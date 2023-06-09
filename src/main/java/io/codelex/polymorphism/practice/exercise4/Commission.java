package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private double totalSales, commissionRate;

    Commission(String eName, String eAddress, String ePhone,
               String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber,  rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    public double pay() {
        double payment = super.pay() + commissionRate * totalSales;
        totalSales = 0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales + "\nCommission Rate: " + commissionRate;
        return result;
    }

}
