package javaBasic.EXERCISES_1.task_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CalculateSquare {
    //    Generate a random int number in range 10 - 100
    //    calculate the square of it. Convert the result to String,  print the result.
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(11, 90);
        System.out.println(square(randomNumber));
    }

    public static int square(int num) {
        return num * num;
    }
}
