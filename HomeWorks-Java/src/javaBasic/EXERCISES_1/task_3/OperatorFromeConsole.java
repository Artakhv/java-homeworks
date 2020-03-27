package javaBasic.EXERCISES_1.task_3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OperatorFromeConsole {
    // Generate 2 random ints, take from console an operator (+,  -,  *  or  /)
    // perform calculations based on the operator, print the result.
    public static void main(String[] args) {
        int x = ThreadLocalRandom.current().nextInt();
        int y = ThreadLocalRandom.current().nextInt();
        Scanner scanner = new Scanner(System.in);
        String o = scanner.nextLine();

        System.out.println(doCalculations(x, y, o));

    }

    private static int doCalculations(int x, int y, String o) {
        int result;
        switch (o) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                result = 404;
                break;
        }
        return result;
    }
}
