package javaBasic.SOMEPRACTICE.HandleExceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class Solution extends Throwable {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
////        String firstString = reader.readLine();
////        System.out.println(firstString);  throws file not found exception
        Dog dog = new Dog("Мухтар");
        dog.putCollar();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + dog.isCollarPutOn
            + "\r\n Поводок надет? " + dog.isLeashPutOn + "\r\n Намордник надет? " + dog.isMuzzlePutOn);
        }

    }
}

