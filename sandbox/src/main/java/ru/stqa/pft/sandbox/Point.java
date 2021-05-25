package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;

    public static void main (String[] args) {
        Point p1 = new Point(4, 10);
        Point p2 = new Point(0, 13);

        System.out.println("Расстояние между двумя точками " + p1.x + ";" + p1.y + " и " + p2.x + ";" + p2.y + " = " + p1.distance(p2));
    }

    public double distance(Point p2){
        return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
