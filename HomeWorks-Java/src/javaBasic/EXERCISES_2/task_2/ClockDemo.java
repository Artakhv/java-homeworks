package javaBasic.EXERCISES_2.task_2;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///////// 1 , 2
        Clock firstClock = new Clock(scanner.nextInt());
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock);
        }
        /////// 3 , 4
        Clock secondClock = new Clock(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        int count = 0;
        while (count <10){
            secondClock.tick();
            System.out.println(secondClock);
            count++;
        }
        ///////// 5 , 6
        firstClock.addClock(secondClock); // question
        System.out.println(firstClock);
        System.out.println(secondClock);
        ///////// 7 like
        Clock clock = firstClock.subtractClock(secondClock);
        System.out.println(firstClock);
        System.out.println(secondClock);





    }
}
