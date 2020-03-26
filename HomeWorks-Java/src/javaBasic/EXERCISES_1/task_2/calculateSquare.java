package javaBasic.EXERCISES_1.task_2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class calculateSquare {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(11, 90);
        System.out.println(square(randomNumber));
    }

    public static int square(int num) {
        return num * num;
    }
}
