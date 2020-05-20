package javaIntermediate.EXERCISES2;

public class Triangle {
    final private Point A;
    final private Point B;
    final private Point C;
    private Line sideAB;
    private Line sideAC;
    private Line sideBC;

    public Triangle(final Point A, final Point B, final Point C){
        this.A = A;
        this.B = B;
        this.C = C;
        calculateSides();
    }

    final void calculateSides(){
        sideAB = new Line(A, B);
        sideAC = new Line(A, C);
        sideBC = new Line(B, C);
        validateTriangle();
    }

    public double getSideAB(){
        return sideAB.getDistance();
    }

    public double getSideAC(){
        return sideAC.getDistance();
    }

    public double getSideBC(){
        return sideBC.getDistance();
    }

    public double getPerimeter(){
        return getSideAB() + getSideAC() + getSideBC();
    }


    public double getArea(){
        final double a = getSideAB();
        final double b = getSideAC();
        final double c = getSideBC();
        final double S = calculateAreaH(a, b, c);
        return S;
    }

    private  double calculateAreaH (final double a, final double b, final double c){
        // Heron's Formula
        // Heron's formula is used to find the area of a triangle
        // knowing the length of all three sides.
        final double p = getPerimeter() * 0.5;
        return Math.abs( Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    private double calculateAreaWithPoints(double x1, double x2, double x3, double y1, double y2, double y3){
        return  Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.0);
    }

    private void validateTriangle(){
        final double a = getSideAB();
        final double b = getSideAC();
        final double c = getSideBC();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not valid triangle !!!!!!!!!!!!!!!!!");
            throw new RuntimeException();
        }
    }

    public boolean contains (Point Z){
        // double area = getArea();
        final double x1 = A.getX();
        final double x2 = B.getX();
        final double x3 = C.getX();
        final double y1 = A.getY();
        final double y2 = B.getY();
        final double y3 = C.getY();
        final double x = Z.getY();
        final double y = Z.getY();
        final double area = calculateAreaWithPoints(x1, x2, x3, y1, y2, y3);
        final double area1 = calculateAreaWithPoints(x, y, x3, y1, y2, y3);
        final double area2 = calculateAreaWithPoints(x1, x2, x, y, y2, y3);
        final double area3 = calculateAreaWithPoints(x1, x2, x3, y1, x, y);
        return area == area1 + area2 + area3;
    }
}
