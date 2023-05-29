package io.codelex.oop.persons;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "1555", 25, "Cook", LocalDate.of(2013, 5, 31));
        Customer customer = new Customer("Peter", "Griffin", "7", 239, "ABC1239", 7);
        System.out.println(employee.getInfo());
        System.out.println(customer.getInfo());
        customer.setPurchaseCount(11);
        System.out.println(customer.getInfo());
    }

}
