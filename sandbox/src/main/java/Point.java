public class Point {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public static void main (String[] args) {
        Point p1 = new Point(4,10,0,13);
        System.out.println("Расстояние между двумя точками " + p1.x1 + ";" + p1.y1 + " и " + p1.x2 + ";" + p1.y2 + " = " + p1.distance());
    }

    public double distance(){
        return Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - this.y1) * (this.y2 - this.y1));
    }

    public Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
