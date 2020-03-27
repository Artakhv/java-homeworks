package javaBasic.EXERCISES_1.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Write a program to get a number from the user and print whether it is positive or negative.

public class guessNegOrPos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String message;
        if (num > 0) {
            message = "positive";
        } else if (num < 0) {
            message = "negative";
        } else {
            message = "zero";
        }
        System.out.println(message);
    }
}
