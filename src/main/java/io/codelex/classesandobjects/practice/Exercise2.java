package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Exercise2 {
    public static void main( String[] args )  {
        Scanner scan = new Scanner(System.in);

        double startKilometers, mileage, liters;

        System.out.print("Enter start reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter current reading: " );
        mileage = scan.nextDouble();

        System.out.print("Enter liters filled up: " );
        liters  = scan.nextDouble();

        scan.close();

        Car car = new Car(startKilometers);
        car.fillUp(mileage, liters);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
        System.out.println(car.economyCar() + " for economic car, " + car.gasHog() + " for gas hog");
        car.fillUp(mileage + 830, liters + 2);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
        System.out.println(car.economyCar() + " for economic car, " + car.gasHog() + " for gas hog");
        car.fillUp(mileage + 1172, liters - 3);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
        System.out.println(car.economyCar() + " for economic car, " + car.gasHog() + " for gas hog");

    }

}
