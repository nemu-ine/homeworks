package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    private static final CarService carService = new CarService();

    public static void main(String[] args) {
        System.out.println("Hello!");
        boolean run = true;
        while (run) {
            System.out.println("Type anything and press enter to continue");
            input.nextLine();
            System.out.println("1 - Add a car to a list, 2 - Remove a car from a list");
            System.out.println("3 - Get a list of all cars, 4 - Get a list of V12 engine cars");
            System.out.println("5 - Get a list of cars produced before 1999, 6 - Get the most expensive car");
            System.out.println("7 - Get the cheapest car, 8 - Get cars with at least 3 manufacturers");
            System.out.println("9 - Get a sorted list of cars by name. 10 - Check if a car is in the list");
            System.out.println("11 - Get a list of cars by manufacturer, 12 - Get a list of cars with year parameters");
            System.out.print("Type 0 to quit. Choose an action: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0 -> run = false;
                case 1 -> addCar();
                case 2 -> removeCar();
                case 3 -> System.out.println(carService.getListOfCars());
                case 4 -> System.out.println(carService.getCarsWithV12());
                case 5 -> System.out.println(carService.getMostExpensiveCar());
                case 6 -> System.out.println(carService.getCarsBefore1999());
                case 7 -> System.out.println(carService.getCheapestCar());
                case 8 -> System.out.println(carService.getCarThreeManufacturers());
                case 9 -> System.out.println(carService.getSortedCarList(input.nextLine()));
                case 10 -> checkCarInList();
                case 11 -> System.out.println(getCarsByManufacturer());
                case 12 -> System.out.println(getCustomList());
            }
        }
        input.close();
    }

    public static void addCar() {
        String name, model;
        double price;
        int yearOfManufacture;
        List manufacturers;
        EngineType type;
        System.out.println("Enter name of the car:");
        name = input.nextLine();
        System.out.println("Enter model of the car:");
        model = input.nextLine();
        System.out.println("Enter price of the car:");
        price = input.nextDouble();
        System.out.println("Enter year of manufacture of the car:");
        yearOfManufacture = input.nextInt();
        input.nextLine();
        type = setTypeOfEngine();
        manufacturers = setListOfManufacturers();
        Car newCar = new Car(name, model, price, yearOfManufacture, manufacturers, type);
        carService.addCar(newCar);
        System.out.println("Car has been added to the list");
    }

    public static void removeCar() {
        String carToRemove = input.nextLine();
        for(Car x : carService.getListOfCars()) {
            if (x.getName().equals(carToRemove)) {
                carService.removeCar(x);
                System.out.println("Car removed successfully");
                return;
            }
        }
        System.out.println("No such car in a list");
    }

    public static void checkCarInList() {
        String checkCar = input.nextLine();
        for(Car x : carService.getListOfCars()) {
            if (x.getName().equals(checkCar)) {
                System.out.println("Car exists in the list");
                return;
            }
        }
        System.out.println("No such car in a list");
    }

    public static List<Car> getCarsByManufacturer() {
        System.out.println("Enter the name of the manufacturer:");
        String manufacturer = input.nextLine();
        List<Car> carsByManufacturer = carService.listManufacturerCars(manufacturer);
        return carsByManufacturer;
    }

    public static List<Car> getCustomList() {
        System.out.println("Enter the name of the manufacturer:");
        String manufacturer = input.nextLine();
        System.out.println("Enter the year to check from:");
        int year = input.nextInt();
        String operation = "";
        while (!(operation.equals("<") || operation.equals(">") || operation.equals("<=") || operation.equals(">=") || operation.equals("=") || operation.equals("!="))) {
            System.out.println("Enter a valid operation (<, >, <=, >=, =, !=):");
            operation = input.nextLine();
        }
        List<Car> customList = carService.matchingParameterCarList(manufacturer, year, operation);
        return customList;
    }

    public static EngineType setTypeOfEngine() {
        System.out.println("Enter type of the engine: (V12, V8, V6, S6, S4, S3)");
        String in = input.nextLine();
        EngineType engine = EngineType.stringToVal(in);
        while (engine == EngineType.MISSING_TYPE) {
           System.out.println("Invalid input, please enter again: (V12, V8, V6, S6, S4, S3");
           in = input.nextLine();
           engine = EngineType.stringToVal(in);
        }
        return engine;
    }

    public static List<Manufacturer> setListOfManufacturers() {
        List list = new ArrayList<>();
        System.out.println("Enter the amount of manufacturers of this car:");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            input.nextLine();
            System.out.println("Enter manufacturer " + i + ":");
            String name = input.nextLine();
            System.out.println("Enter country:");
            String country = input.nextLine();
            System.out.println("Enter year of establishment:");
            int year = input.nextInt();
            Manufacturer manufacturer = new Manufacturer(name, year, country);
            list.add(manufacturer);
            System.out.println("Manufacturer " + i + " added");
        }
        return list;
    }

}
