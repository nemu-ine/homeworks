package io.codelex.oop.computers;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("yes", 500, "wat", "wow", "jdisoadjaiso");
        Laptop laptop = new Laptop("yes", 500, "wat", "wow", "jdisoadjaiso", "89372189");
        Laptop laptop2 = new Laptop("yes", 500, "wat", "wow", "jdisoadjaiso", "89372189");
        System.out.println(computer.equals(laptop));
        System.out.println(laptop2.equals(laptop));


    }

}
