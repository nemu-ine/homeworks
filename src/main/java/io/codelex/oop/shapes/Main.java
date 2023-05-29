package io.codelex.oop.shapes;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 4);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Triangle area " + triangle.getArea());
        System.out.println("Triangle perimeter " + triangle.getPerimeter());
        System.out.println("Rectangle area " + rectangle.getArea());
        System.out.println("Rectangle perimeter " + rectangle.getPerimeter());
    }

}
