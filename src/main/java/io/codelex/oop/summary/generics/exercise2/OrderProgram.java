package io.codelex.oop.summary.generics.exercise2;

public class OrderProgram {

    public static void main(String[] args) {

        Item foodItem = new FoodItem("Milk", 0.75, "15/07/2023");
        Item electronicsItem = new ElectronicsItem("Radio", 25.00, 100);
        Item householdItem = new HouseholdItem("Bucket", 5.00, "red");

        Service itemPacking = new ItemPacking();

        Order order = new Order();
        order.addItem(foodItem);
        order.addItem(electronicsItem);
        order.addItem(householdItem);
        order.addItem(itemPacking);

        Invoice invoice = new Invoice(order, "INV123");

        System.out.println(invoice.getFormattedInvoice());

    }

}
