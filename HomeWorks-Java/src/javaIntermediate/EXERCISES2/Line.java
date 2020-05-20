package javaIntermediate.EXERCISES2;

public class Line {
    final private double distance;

    public Line(final Point A, final Point B) {
        this.distance = calculateDistance(A, B);
    }

    private double calculateDistance(final Point A, final Point B) {
        // d=sqrt((x2−x1)2+(y1−y2)2)
        return Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2));
    }

    public double getDistance() {
        return distance;
    }

    public double getArea() {
        // 1x1
        return distance;
    }
}
