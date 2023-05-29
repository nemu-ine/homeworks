package io.codelex.oop.imperialToMetric;

import java.util.Scanner;

public class Main {

    private static final MeasureConverter measureConverter = new MeasureConverter();
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final String valuesInString = getValuesInString();
        loop: while (true) {
            System.out.println("0 to quit. 1-6 convert. Conversion types:");
            System.out.println(valuesInString);
            int action = input.nextInt();
            System.out.println("Enter the value you want to convert:");
            double val = input.nextDouble();
            ConversionType conversionType = null;
            input.nextLine();
            switch (action) {
                case 0 -> {
                    break loop;
                }
                case 1 -> conversionType = ConversionType.METERS_TO_YARDS;
                case 2 -> conversionType = ConversionType.YARDS_TO_METERS;
                case 3 -> conversionType = ConversionType.CENTIMETERS_TO_INCHES;
                case 4 -> conversionType = ConversionType.INCHES_TO_CENTIMETERS;
                case 5 -> conversionType = ConversionType.KILOMETERS_TO_MILES;
                case 6 -> conversionType = ConversionType.MILES_TO_KILOMETERS;
                default -> System.out.println("invalid choice, try again.");
            }
            System.out.println(measureConverter.convert(val, conversionType));
        }
        System.out.println("Bye!");
        input.close();
    }

    public static String getValuesInString() {
        StringBuilder valuesInString = new StringBuilder();
        for (ConversionType x : ConversionType.values()) {
            valuesInString.append(x.name()).append(", ");
        }
        return valuesInString.substring(0, valuesInString.length() - 2);
    }

}
