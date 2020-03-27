package javaBasic.EXERCISES_1.task_10;

import java.util.Scanner;

public class ShowWeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printWeekDayBasedOnNumber(scanner.nextInt());
    }

    public static void printWeekDayBasedOnNumber(int number) {
        switch (number) {
            case 1:
                System.out.println(WeekDay.MONDAY);
                break;
            case 2:
                System.out.println(WeekDay.THURSDAY);
                break;
            case 3:
                System.out.println(WeekDay.WEDNESDAY);
                break;
            case 4:
                System.out.println(WeekDay.TUESDAY);
                break;
            case 5:
                System.out.println(WeekDay.FRIDAY);
                break;
            case 6:
                System.out.println(WeekDay.SATURDAY);
                break;
            case 7:
                System.out.println(WeekDay.SUNDAY);
                break;
            default:
                System.out.println("Nothing to show");
                break;
        }
    }
}


enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}