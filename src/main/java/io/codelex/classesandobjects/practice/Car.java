package io.codelex.classesandobjects.practice;

public class Car {
    double startKilometers, currentKilometers, liters;

    Car(double firstOdo) {
        this.startKilometers = firstOdo;
        this.currentKilometers = firstOdo;
    }

    void fillUp (double mileage, double liters) {
        this.startKilometers = this.currentKilometers;
        this.currentKilometers = mileage;
        this.liters = liters;
    }

    double calculateConsumption() {
        return 100 / ((currentKilometers - startKilometers) / liters);
    }

    boolean gasHog() {
        return calculateConsumption() > 15;
    }

    boolean economyCar() {
        return calculateConsumption() < 5;
    }

}
