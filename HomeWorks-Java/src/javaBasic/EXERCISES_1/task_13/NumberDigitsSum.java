package javaBasic.EXERCISES_1.task_13;

import java.util.Scanner;

public class NumberDigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(calculateDigits(num));
    }

    public static int calculateDigits(int number){
        int sum = 0;
        while (number != 0) {
            int num = number%10;
            sum += num;
            number /= 10;
        }
        return sum;
    }
}
