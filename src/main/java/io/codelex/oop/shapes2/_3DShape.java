package io.codelex.oop.shapes2;

abstract class _3DShape extends Shape {
    public abstract double calculateVolume();
}

class Cone extends _3DShape {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius; //basically, circle outer line
    }

    public double calculateArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    public double calculateVolume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}

class Cube extends _3DShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 12 * side;
    }

    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
