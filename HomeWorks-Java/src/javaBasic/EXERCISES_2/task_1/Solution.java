package javaBasic.EXERCISES_2.task_1;

public class Solution {

    public static void main(String[] args) {

        /////////  2
        final Holiday june5 = new Holiday("June", 5, 5);
        final Holiday september1 = new Holiday("September", 5, 8);
        System.out.println(june5.isInSameMonth(september1));
        /////////  2

        /////////  3
        final Holiday may2 = new Holiday("May", 2, 6);
        final Holiday september7 = new Holiday("September", 7, 8);
        final Holiday september8 = new Holiday("September", 8, 8);
        final Holiday[] holidays = {june5, september1, may2, september7, september8};
        System.out.println(june5.avgDate(holidays));
        /////////  3

        /////////  4
        final Holiday independenceDay = new Holiday("Independence day", 5, 5);
        System.out.println(independenceDay.getName() + " " + independenceDay.getMonth() + " " + independenceDay.getDay());
        /////////  4
    }

}
