package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private int fuelAmount;

    public FuelGauge() {
        fuelAmount = 0;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void printFuelAmount() {
        System.out.println("The car's current amount of fuel is: " + fuelAmount + " liters");
    }

    public void incrementFuel() {
        if (fuelAmount < 70) {
            fuelAmount++;
        } else {
            System.out.println("The car is full.");
        }
    }

    public void decrementFuel() {
        if (fuelAmount > 0) {
            fuelAmount--;
        }
    }
}