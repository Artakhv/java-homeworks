package javaBasic.EXERCISES_1.task_8;

import java.util.Scanner;

public class SumOfMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        System.out.println(calculateMultiples(first,last)) ;

    }

    public static int calculateMultiples(int n, int N) {
        int sum = 0;
        for (int i = n; i <= N; i++) {
            if (i % n == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
