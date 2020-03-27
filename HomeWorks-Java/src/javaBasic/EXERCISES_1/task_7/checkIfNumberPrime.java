package javaBasic.EXERCISES_1.task_7;

import java.util.Scanner;

public class checkIfNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d is prime: %b", number, checkIsPrime(number));
    }

    public static boolean checkIsPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
