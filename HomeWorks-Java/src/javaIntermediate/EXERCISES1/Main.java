package javaIntermediate.EXERCISES1;

public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.sumIterative(5));
        System.out.println(math.sumRecursive(5));
        System.out.println(math.sumIterative(2, 6));
        System.out.println(math.sumRecursive(0, 5));
        System.out.println(math.multiplyIterative(5, 10));
        System.out.println(math.multiplyRecursive(4, 10));
        System.out.println(math.doubleFactorialIterative(5));
        System.out.println(math.doubleFactorialRecursive(5));
        System.out.println(math.fibonacciIterative(9));
        System.out.println(math.fibonacciRecursive(9));
    }
}
