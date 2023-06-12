package io.codelex.classesandobjects.practice;

public class Exercise1 {

    public static void main(String[] args) {

        Product test1 = new Product("Logitech mouse", 70.00, 14);
        Product test2 = new Product("iPhone 5s", 999.99, 3);
        Product test3 = new Product("Epson EB-U05", 440.46, 1);

        test1.setAmount(3);
        test1.setPrice(50);

        test1.printProduct();
        test2.printProduct();
        test3.printProduct();

    }

}
