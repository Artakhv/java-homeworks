package javaBasic.EXERCISES_5;

//      Write a Math class that contains both iterative and recursive solutions for following math formulas
//        > sum(n) that computes the sum of all integer numbers in range [1, n]
//        > sum(low, high) that computes the sum of all integer numbers in range [low, high]
//        > multiply(a, b) that computes a * b
//        > n!! that computes double factorial for given n (https://en.wikipedia.org/wiki/Double_factorial)
//        > fibonacci(n) that computes n-th member of fibonacci sequence

public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.sumIterative(5));
        System.out.println(math.sumRecursive(5));
        System.out.println(math.sumIterative(2,6));
        System.out.println(math.sumRecursive(0 , 5));
        System.out.println(math.multiplyIterative(5, 10));
        System.out.println(math.multiplyRecursive(4, 10));
        System.out.println(math.doubleFactorialIterative(5));
        System.out.println(math.doubleFactorialRecursive(5));
        System.out.println(math.fibonacciIterative(9));
        System.out.println(math.fibonacciRecursive(9));
    }
}
