package javaBasic.EXERCISES_1.task_9;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("a = %d  and b = %d", a, b);
        System.out.println();
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.printf("a = %d  and b = %d", a, b);
    }
}
