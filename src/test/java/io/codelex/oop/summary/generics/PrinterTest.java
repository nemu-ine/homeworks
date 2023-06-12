package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    @Test
    public void bigDecimalTest() {
        BigDecimal number = new BigDecimal("10.5");
        Printer printer = new Printer(number);
        final String expectedOutput = number.toString();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        printer.print();
        String printedOutput = outputStream.toString().substring(0, outputStream.toString().length() - 1);

        assertEquals(expectedOutput, printedOutput);
    }

    @Test
    public void stringTest() {
        String text = "this is a string ";
        Printer printer = new Printer(text);
        final String expectedOutput = text;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        printer.print();
        String printedOutput = outputStream.toString().substring(0, outputStream.toString().length() - 1);

        assertEquals(expectedOutput, printedOutput);
    }

    @Test
    public void intStringTest() {
        int number = 7;
        String number2 = "7";
        Printer printer = new Printer(number);
        Printer printer2 = new Printer(number2);
        final String expectedOutput = number + "\n" + number2;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        printer.print();
        printer2.print();
        String printedOutput = outputStream.toString().substring(0, outputStream.toString().length() - 1);

        assertEquals(expectedOutput, printedOutput);

    }


}
