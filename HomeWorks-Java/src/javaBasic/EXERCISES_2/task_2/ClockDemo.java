package javaBasic.EXERCISES_2.task_2;

import java.util.Scanner;
public class ClockDemo {
    public static void main(final String[] args) {
        try(final Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please input Seconds since midnight for First Clock: ");
            final int firstClockSecnondsSinceMidnight = scanner.nextInt();
            final Clock firstClock = new Clock(firstClockSecnondsSinceMidnight);
            System.out.println();
            for (int i = 0; i < 10; i++) {
                firstClock.tick();
                System.out.println(firstClock.toString());
            }
            System.out.print("Please input Second Clocks Hours, Minutes, Seconds: ");
            final int secondClockHours = scanner.nextInt();
            final int secondClockMinutes = scanner.nextInt();
            final int secondClockSeconds = scanner.nextInt();
            final Clock secondClock = new Clock(secondClockHours, secondClockMinutes, secondClockSeconds);
            System.out.println();
            for (int i = 0; i < 10; i++) {
                secondClock.tick();
                System.out.println(secondClock.toString());
            }
            firstClock.addClock(secondClock);
            System.out.printf("\nFirst Clock is: %s. Second Clock is: %s.", firstClock.toString(), secondClock.toString());
            final Clock thirdClock = firstClock.subtractClock(secondClock);
            System.out.println("\nThird Clock is: " + thirdClock.toString());
        }
    }
}