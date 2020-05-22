package javaIntermediate.PRACTICE1.Initializers;

public class Rectangle extends Shape {
    private int width;
    private int height;
    static {
        System.out.println("Rectangle static initializer");
    }
    {
        System.out.println("Rectangle initializer");
    }
    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle constructor");
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    @Override
    void draw() {
        System.out.println("****");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println("****");
    }
}
