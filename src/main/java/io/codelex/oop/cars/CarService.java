package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;

class CarService {

    private final List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getListOfCars() {
        return carList;
    }

    public List<Car> getCarsWithV12() {
        List<Car> v12 = new ArrayList<>();
        for (Car x : carList) {
            if (x.getType() == EngineType.V12) {
                v12.add(x);
            }
        }
        return v12;
    }

    public List<Car> getCarsBefore1999() {
        List<Car> before1999 = new ArrayList<>();
        for (Car x : carList) {
            if (x.getYearOfManufacture() < 1999) {
                before1999.add(x);
            }
        }
        return before1999;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensive = null;
        for (Car x : carList) {
            if (mostExpensive == null || mostExpensive.getPrice() < x.getPrice()) {
                mostExpensive = x;
            }
        }
        return mostExpensive;
    }


    public Car getCheapestCar() {
        Car cheapest = null;
        for (Car x : carList) {
            if (cheapest == null || cheapest.getPrice() > x.getPrice()) {
                cheapest = x;
            }
        }
        return cheapest;
    }

    public List<Car> getCarThreeManufacturers() {
        List<Car> threeManufacturers = new ArrayList<>();
        for (Car x : carList) {
            if (x.getList().size() > 2) {
                threeManufacturers.add(x);
            }
        }
        return threeManufacturers;
    }

    public List<Car> getSortedCarList(String sortBy) {
        List<Car> list = new ArrayList<>();
        switch (sortBy) {
            case "ascending" -> list = ascendingCarList(carList.size());
            case "descending" -> list = descendingCarList(carList.size());
            default -> System.out.println("Invalid parameter");
        }
        return list;
    }

    private List<Car> ascendingCarList(int size) {
        List<Car> ascending = carList;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                Car currentCar = ascending.get(j);
                Car nextCar = ascending.get(j + 1);
                if (currentCar.getName().compareTo(nextCar.getName()) > 0) {
                    ascending.set(j, nextCar);
                    ascending.set(j + 1, currentCar);
                }
            }
        }
        return ascending;
    }

    private List<Car> descendingCarList(int size) {
        List<Car> descending = carList;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                Car currentCar = descending.get(j);
                Car nextCar = descending.get(j + 1);
                if (currentCar.getName().compareTo(nextCar.getName()) < 0) {
                    descending.set(j, nextCar);
                    descending.set(j + 1, currentCar);
                }
            }
        }
        return descending;
    }

    public boolean isCarInList(Car car) {
        for (Car x : carList) {
            if (x.equals(car)) {
                return true;
            }
        }
        return false;
    }

    public List<Car> listManufacturerCars(String manufacturer) {
        List<Car> manufacturerCars = new ArrayList<>();
        for (Car x : carList) {
            for (Manufacturer y : x.getList()) {
                if (y.getName().equals(manufacturer)) {
                    manufacturerCars.add(x);
                }
            }
        }
        return manufacturerCars;
    }

    public List<Car> matchingParameterCarList(String manufacturer, int year, String choice) {
        List<Car> matching = listManufacturerCars(manufacturer);
        for (Car x : matching) {
            boolean criteriaMatches = false;
            switch (choice) {
                case "<" -> criteriaMatches = x.getYearOfManufacture() < year;
                case ">" -> criteriaMatches = x.getYearOfManufacture() > year;
                case "<=" -> criteriaMatches = x.getYearOfManufacture() <= year;
                case ">=" -> criteriaMatches = x.getYearOfManufacture() >= year;
                case "=" -> criteriaMatches = x.getYearOfManufacture() == year;
                case "!=" -> criteriaMatches = x.getYearOfManufacture() != year;
            }
            if (criteriaMatches) matching.add(x);
        }
        return matching;
    }

}
