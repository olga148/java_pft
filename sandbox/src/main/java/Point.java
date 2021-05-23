public class Point {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public static void main (String[] args) {
        Point p1 = new Point(4, 10);
        Point p2 = new Point(0, 13);

        p2.x2 = 0;
        p2.y2 = 13;

        System.out.println("Расстояние между двумя точками " + p1.x1 + ";" + p1.y1 + " и " + p2.x2 + ";" + p2.y2 + " = " + p1.distance(p2));
    }

    public double distance(Point p2){
        return Math.sqrt((p2.x2 - this.x1) * (p2.x2 - this.x1) + (p2.y2 - this.y1) * (p2.y2 - this.y1));
    }

    public Point(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
}
