package io.codelex.oop.computers;

import java.awt.font.LayoutPath;
import java.util.Objects;

class Computer {

    private String processor, graphicsCard, company, model;
    private int ram;

    public Computer(String processor, int ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + "'" +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + "'" +
                ", company='" + company + "'" +
                ", model='" + model + "'" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram &&
                processor.equals(computer.processor) &&
                graphicsCard.equals(computer.graphicsCard) &&
                company.equals(computer.company) &&
                model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }
    
}
