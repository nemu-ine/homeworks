package io.codelex.classesandobjects.practice;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point first, Point second) {
        int tempX = first.x;
        int tempY = first.y;

        first.x = second.x;
        first.y = second.y;

        second.x = tempX;
        second.y = tempY;
    }
}
public class Exercise9 {

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);

        Point.swapPoints(p1, p2);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

}
