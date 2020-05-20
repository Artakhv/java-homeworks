package javaIntermediate.EXERCISES2;

public class Rectangle {
    final private Point A;
    final private Point B;
    final private Point C;
    final private Point D;
    final private Line lineAB;
    final private Line lineBC;
    final private Line lineCD;
    final private Line lineAD;

    public Rectangle(final Point A, final Point B, final Point C, final Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        lineAB = new Line(A, B);
        lineBC = new Line(B, C);
        lineCD = new Line(C, D);
        lineAD = new Line(A, D);
        final boolean isValid = validateRectangle();
        if (!isValid) {
            System.out.println("Not valid rectangle !!!!!!!!!!!!!!!");
            throw new RuntimeException();
        }
    }

    final public double getPerimeter() {
        return 2.0 * (getSideAB() + getSideBC());
    }

    final public double getArea() {
        return getSideAB() * getSideBC();
    }

    final public boolean contains(final Point z) {
        final double x1 = A.getX();
        final double x2 = D.getX();
        final double y1 = A.getY();
        final double y2 = B.getY();
        final double x = z.getX();
        final double y = z.getY();
        return x > x1 && x < x2 && y > y1 && y < y2;
    }

    final public double getSideAB() {
        return lineAB.getDistance();
    }

    final public double getSideBC() {
        return lineBC.getDistance();
    }

    final public double getSideCD() {
        return lineCD.getDistance();
    }

    final public double getSideAD() {
        return lineAD.getDistance();
    }

    private boolean validateRectangle() {
        final double a = getSideAB();
        final double b = getSideBC();
        final double c = getSideCD();
        final double d = getSideAD();
        if (a == b && a == c &&
                a == d && c == d &&
                b == c && b == d)
            return true;
        else if (a == b && c == d)
            return true;
        else if (a == d && c == b)
            return true;
        else return a == c && d == b;
    }
}
