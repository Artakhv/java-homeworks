package javaBasic.EXERCISES_1.task_12;

import java.util.Scanner;

public class ReverseNumber extends Object{
    private String reversedNumber = "";
    // ???????????
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // es mi qich pinel em, bayc uzum ei toString-y override anei ))
        ReverseNumber num = new ReverseNumber(number);
        System.out.println(num);
    }

    ReverseNumber(int number) {
        while (number != 0) {
            int num = number%10;
            reversedNumber += num;
            number /= 10;
        }
    }

    @Override
    public String toString() {
        return reversedNumber;
    }
}
