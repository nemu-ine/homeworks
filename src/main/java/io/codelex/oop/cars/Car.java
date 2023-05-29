package io.codelex.oop.cars;

import java.util.List;
import java.util.Objects;

class Car {

    private String name, model;
    private double price;
    private int yearOfManufacture;
    private List<Manufacturer> list;
    private EngineType type;

    public Car(String name, String model, double price, int yearOfManufacture, List manufacturers, EngineType type) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.list = manufacturers;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getList() {
        return list;
    }

    public void setList(List<Manufacturer> list) {
        this.list = list;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, list, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) {
            return false;
        }
        Car o = (Car) obj;
        boolean isEqual = (this.name.equals(o.name) && this.model.equals(o.model) && this.price == o.price && this.yearOfManufacture == o.yearOfManufacture && this.list.equals(o.list) && this.type == o.type);
        return isEqual;
    }

}
