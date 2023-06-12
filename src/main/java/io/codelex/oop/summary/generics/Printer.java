package io.codelex.oop.summary.generics;

public class Printer {

    //Fix this class so that any object, not only BigDecimal can be printed
    //Test the functionality

    private final Object thingToPrint;

    public Printer(Object thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public Object getThingToPrint() {
        return thingToPrint;
    }
}
