package javaIntermediate.PRACTICE1.Initializers;

public class Shape {
    private String color;
    static {
        System.out.println("Shape static initializer");
    }
    {
        System.out.println("Shape initializer");
    }
    void draw() {
    }
    public Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor");
    }
}
