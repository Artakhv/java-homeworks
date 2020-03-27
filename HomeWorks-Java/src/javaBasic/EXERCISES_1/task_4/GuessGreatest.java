package javaBasic.EXERCISES_1.task_4;

import java.util.Scanner;

public class GuessGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max(max(a, b), c));
    }

    public static int max(int x, int y) {
        return x >= y ? x : y;
    }
}
