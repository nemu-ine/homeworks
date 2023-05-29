package io.codelex.oop.persons;

import java.time.LocalDate;

abstract class Person {

    protected String firstName, lastName, id;
    protected int age;

    public Person(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public abstract String getInfo();

}

class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate today = LocalDate.now();
        int yearDifference = today.getYear() - this.startedWorking.getYear();
        int monthDifference = today.getMonth().getValue() - this.startedWorking.getMonth().getValue();
        int dayDifference = today.getDayOfMonth() - this.startedWorking.getDayOfMonth();
        int yearExperience = (yearDifference * 12 + monthDifference) / 12;
        if ((monthDifference == 0 && dayDifference < 0) || monthDifference < 0) {
            return yearExperience - 1;
        } else {
            return yearExperience;
        }

    }

    @Override
    public String getInfo() {
        return this.position + " " + this.firstName + " " + this.lastName + " (" + this.getWorkExperience() + " years)";
    }

}

class Customer extends Person {

    private String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return this.purchaseCount;
    }

    public void setPurchaseCount(int count) {
        this.purchaseCount = count;
    }

    @Override
    public String getInfo() {
        return this.firstName + " " + this.lastName + " " + this.customerId + " (" + this.purchaseCount + " purchases)";
    }
}