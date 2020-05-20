package javaIntermediate.EXERCISES2;

public class Main {
    public static void main(String[] args) {
        /// Triangle START
        // final Point A = new Point(0, 0);
        // final Point B = new Point(0, 30);
        // final Point C = new Point(30, 0);
        // final Point Z = new Point(40,-5);
        // final Triangle triangle = new Triangle(A, B, C);

        // System.out.println("AC: " + triangle.getSideAC());
        // System.out.println("AB: " + triangle.getSideAB());
        // System.out.println("BC: " + triangle.getSideBC());
        // System.out.println("Area: "+ triangle.getArea());
        // System.out.println("Perimeter: " + triangle.getPerimeter());
        // System.out.println("Contains: "+ triangle.contains(Z));
        /// Triangle END

        ///  Rectangle START
        // final Point A = new Point(0, 0);
        // final Point B = new Point(0, 20);
        // final Point C = new Point(40, 20);
        // final Point D = new Point(40, 0);
        // final Point Z = new Point(39, 1);
        // final Rectangle rectangle = new Rectangle(A, B, C, D);
        // System.out.println("AB: " + rectangle.getSideAB());
        // System.out.println("BC: " + rectangle.getSideBC());
        // System.out.println("CD: " + rectangle.getSideCD());
        // System.out.println("AD: " + rectangle.getSideAD());
        // System.out.println("Area: " + rectangle.getArea());
        // System.out.println("Perimeter: " + rectangle.getPerimeter());
        // System.out.println("Contains: "+ rectangle.contains(Z));
        ///  Rectangle END


        ///  Circle START
         final Point A = new Point(0, 0);
         final Point B = new Point(0, 20);
         final Point Z = new Point(3, 4);
         final Circle circle = new Circle(A, B);
         System.out.println("Radius: " + circle.getRadius());
         System.out.println("Area: " + circle.getArea());
         System.out.println("Perimeter: " + circle.getPerimeter());
         System.out.println("Contains: "+ circle.contains(Z));
        ///  Circle END
    }
}
