package io.codelex.polymorphism.practice.exercise1;

public class Hyundai implements Car {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 13;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 13;
    }

    @Override
    public Integer getSpeed() {
        return currentSpeed;
    }

}
