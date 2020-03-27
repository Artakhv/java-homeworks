package javaBasic.EXERCISES_1.task_11;

import java.util.Scanner;

public class RenderTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i=1; i<= length; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
