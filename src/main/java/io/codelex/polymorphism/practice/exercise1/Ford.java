package io.codelex.polymorphism.practice.exercise1;

public class Ford implements Car, NitrousOxideEngine {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 9;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 9;
    }

    @Override
    public void startEngine() {
        System.out.println("brrrrrrr");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 25;
    }

    @Override
    public Integer getSpeed() {
        return currentSpeed;
    }

}
