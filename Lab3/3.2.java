package POJ.Punkt;
public class Punkt {
    public static void main(String[] args) {
        Point first = new Point();
        Point second = new Point(2344.58842, 127.1413452376);
        System.out.printf("Odległość między punktami wynosi: %f%n", first.DistanceTo(second));
    }
    private static class Point {
        double x = 0, y = 0;
        public Point() {}
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double DistanceTo(double x, double y) {
            return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        }
        public double DistanceTo(Point other) {
            return this.DistanceTo(other.x, other.y);
        }
    }
}
