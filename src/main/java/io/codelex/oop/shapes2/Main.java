package io.codelex.oop.shapes2;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(6, 4);
        Triangle triangle = new Triangle(6, 4);
        Hexagon hexagon = new Hexagon(6);
        Cone cone = new Cone(6, 4);
        Cube cube = new Cube(7);

        System.out.println(rectangle.calculatePerimeter() + " " + rectangle.calculateArea());
        System.out.println(triangle.calculatePerimeter() + " " + triangle.calculateArea());
        System.out.println(hexagon.calculatePerimeter() + " " + hexagon.calculateArea());
        System.out.println(cone.calculatePerimeter() + " " + cone.calculateArea() + " " + cone.calculateVolume());
        System.out.println(cube.calculatePerimeter() + " " + cube.calculateArea() + " " + cube.calculateVolume());

    }

}
