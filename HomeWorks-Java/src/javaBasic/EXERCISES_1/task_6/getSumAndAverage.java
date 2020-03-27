package javaBasic.EXERCISES_1.task_6;

import java.util.Scanner;

public class getSumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double[] doubles = new double[5];
        while (count < 5) {
            doubles[count] = scanner.nextDouble();
            count++;
        }
        System.out.println("Sum: " +sum(doubles) + " " + " Average:" + sum(doubles)/doubles.length);
    }

    public static double sum(double[] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

}
