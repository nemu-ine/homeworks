package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    public static Scanner input = new Scanner(System.in);
    public static List<HashMap<String, String>> possibleRoutes = new ArrayList<>();
    public static Map<String, String> checkForInitial = new HashMap<>();

    public static ArrayList<String> output = new ArrayList<>();
    public static String initialCity = "", currentCity = "", outputRouteList = "";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Set<String> set = new HashSet<>(Files.readAllLines(path, charset));
        convertSetToList(set);
        outputRouteList = formatString();
        loop: while (!checkForInitial.containsValue(initialCity)) {
            System.out.println("""
                    What would you like to do:
                    To display list of the cities press 1
                    To exit program press #""");
            System.out.print("> ");
            String in = input.nextLine();
            switch(in) {
                case "#" -> {
                    System.out.println("Exiting...");
                    break loop;
                }
                case "1" -> displayCities();
                default -> System.out.println("Invalid input, try again.");
            }
        }
        System.out.println("Round-trip route: ");
        System.out.println(output);
    }

    public static void convertSetToList(Set<String> set) {
        for (String destination : set) {
            String[] split = destination.split(" -> ");
            HashMap<String, String> routeToCity = new HashMap<>();
            routeToCity.put(split[0], split[1]);
            possibleRoutes.add(routeToCity);
        }
    }

    public static void displayCities() {
        loop: while (!checkForInitial.containsValue(initialCity)) {
            System.out.println(outputRouteList + "\n" +
                    "To select a city from which you would like to start press 1\n" +
                    "To exit press #");
            System.out.print("> ");
            String in = input.nextLine();
            switch (in) {
                case "#" -> {
                    break loop;
                }
                case "1" -> selectCity();
                default -> System.out.println("Invalid input, try again.");
            }
            while (!checkForInitial.containsValue(initialCity) && !initialCity.isEmpty()) {
                completeRoute();
            }
        }
    }

    public static void selectCity() {
        String key;

        System.out.println("Your city pick:");
        System.out.print("> ");
        key = input.nextLine();

        routeCalculator(key);
    }

    public static void routeCalculator(String key) {
        String value;
        boolean isValid = false;

        System.out.println("Possible routes: ");
        for (HashMap<String, String> map : possibleRoutes) {
            if (map.containsKey(key)) {
                System.out.println(key + " -> " + map.get(key));
                isValid = true;
            }
        }
        if (!isValid) {
            System.out.println("Invalid city. Returning.");
            return;
        }

        System.out.println("Enter destination:");
        System.out.print("> ");
        value = input.nextLine();

        for (HashMap<String, String> map : possibleRoutes) {
            if (map.containsValue(value)) {
                if (initialCity.isEmpty()) {
                    output.add(key);
                    initialCity = key;
                }
                currentCity = value;
                checkForInitial.put(key, value);
                output.add(value);
                return;
            }
        }
        System.out.println("Incorrect route picked.");
    }

    public static void completeRoute() {
        if (checkForInitial.containsValue(initialCity)) return;
        routeCalculator(currentCity);
    }

    public static String formatString() {
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (HashMap<String, String> map : possibleRoutes) {
            if (i % 5 == 0 && i != 0) {
                str.append("\n");
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String val = entry.toString().replace("=", " -> ");
                str.append(val).append(", ");
            }
            i++;
        }
        return str.substring(0, str.length() - 2);
    }
}
