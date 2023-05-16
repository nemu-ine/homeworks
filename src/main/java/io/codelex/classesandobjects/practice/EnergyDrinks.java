package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers(PURCHASED_ENERGY_DRINKS) + " bought at least one energy drink per week.");
        System.out.println(calculatePreferCitrus(PREFER_CITRUS_DRINKS) + " of those prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(double energyDrinks) {
        return NUMBERED_SURVEYED * energyDrinks;
    }

    public static double calculatePreferCitrus(double citrusDrinks) {
        return calculateEnergyDrinkers(PURCHASED_ENERGY_DRINKS) * citrusDrinks;
    }

}
