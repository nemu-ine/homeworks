package io.codelex.oop.shapes2;

abstract class Shape {
    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length,  width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculatePerimeter() {
        return base + 2 * (Math.sqrt(Math.pow(height, 2) + Math.pow(base/2, 2)));
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 6 * side;
    }

    public double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}
