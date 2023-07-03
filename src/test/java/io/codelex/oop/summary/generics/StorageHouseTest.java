package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorageHouseTest {

    @Test
    public void testGetMaybeFirstItem() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(6234);
        storageHouse.addMoreItems(6742);
        storageHouse.addMoreItems(78542);

        Optional<Integer> firstItem = storageHouse.getMaybeFirstItem();
        assertEquals(6234, firstItem.get());
    }

    @Test
    public void testPrintItems() {
        StorageHouse<String> storageHouse = new StorageHouse<>("First item");
        storageHouse.addMoreItems(storageHouse.toString());
        storageHouse.addMoreItems(" ");
        String expectedOutput = "First item" + "\n" + storageHouse.toString() + "\n" + " ";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        storageHouse.printItems();

        String printedOutput = outputStream.toString().substring(0, outputStream.toString().length() - 1);

        assertEquals(expectedOutput, printedOutput);
    }

}
