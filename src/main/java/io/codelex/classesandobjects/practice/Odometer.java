package io.codelex.classesandobjects.practice;

public class Odometer {

    private int currentMileage;
    private FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge) {
        this.currentMileage = 0;
        this.fuelGauge = fuelGauge;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void reportMileage() {
        System.out.println("Current mileage: " + currentMileage + " km");
    }

    public void incrementMileage() {
        currentMileage++;

        if (currentMileage > 999999) {
            currentMileage = 0;
        }

        if (currentMileage % 10 == 0) {
            fuelGauge.decrementFuel();
        }
    }

}
