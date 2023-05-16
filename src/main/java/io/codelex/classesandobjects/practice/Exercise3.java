package io.codelex.classesandobjects.practice;

public class Exercise3 {

    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        for (int i = 0; i < 12; i++) {
            fuelGauge.incrementFuel();
        }

        while (fuelGauge.getFuelAmount() > 0) {
            odometer.incrementMileage();
            System.out.println("Current mileage: " + odometer.getCurrentMileage() + " km");
            System.out.println("Current fuel amount: " + fuelGauge.getFuelAmount() + " liters");
            System.out.println("------");
        }

        System.out.println("The car has run out of fuel.");
    }

}
