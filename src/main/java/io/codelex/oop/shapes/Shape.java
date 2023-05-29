package io.codelex.oop.shapes;

abstract class Shape {

    protected int numSides;

    public Shape(int sides) {
        this.numSides = sides;
    }

    public int getNumSides() {
        return this.numSides;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


}

class Rectangle extends Shape {

    private final double w, h;

    public Rectangle(double width, double height) {
        super(4);
        this.w = width;
        this.h = height;
    }

    @Override
    public double getArea() {
        return this.w * this.h;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.w + this.h);
    }
}

class Triangle extends Shape {

    private final double w, h;

    public Triangle(double width, double height) {
        super(3);
        this.w = width;
        this.h = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.w * this.h;
    }

    @Override
    public double getPerimeter() {
        double s = Math.sqrt(Math.pow(this.w/2, 2) + Math.pow(this.h, 2));
        return 2 * s + this.w;
    }
}