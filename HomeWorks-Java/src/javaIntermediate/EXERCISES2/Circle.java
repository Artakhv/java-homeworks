package javaIntermediate.EXERCISES2;

public class Circle {
    private final double radius;
    private final Point A;
    private final Point B;
    private final Line lineAB;

    public Circle(final Point A, final Point B) {
        this.A = A;
        this.B = B;
        lineAB = new Line(A , B);
        validateCircle();
        radius = lineAB.getDistance()/2.0;
    }

    public double getRadius() {
        return radius;
    }

    private void validateCircle() {
        if (lineAB.getDistance() <= 0) {
            System.out.println("We cant draw circle without radius");
            throw new RuntimeException();
        }
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public boolean contains(final Point Z){
        final double x = A.getX();
        final double y = A.getY();
        final double xz = Z.getX();
        final double yz = Z.getY();
        return Math.pow(xz - x, 2) + Math.pow(yz - y, 2) <= Math.pow(radius, 2);
    }
}
