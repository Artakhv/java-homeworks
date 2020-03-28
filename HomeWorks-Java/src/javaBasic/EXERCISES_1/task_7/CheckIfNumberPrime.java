package javaBasic.EXERCISES_1.task_7;

import java.util.Scanner;

public class CheckIfNumberPrime {
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
  /// recommended way

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
