package io.codelex.classesandobjects.practice;

public class Point {

    private int x;
    private int y;

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
