package javaBasic.SOMEPRACTICE.AbstractClassesInterfaces;

public class Solution {
    // Good example from tutor

    public static void main(final String... args) {
        final Human narek = new Man(new FullName("Narek", "Harutyunyan"), 22);
        final Human anna = new Woman(new FullName("Anna", "Harutyunyan"), 22);
        printHumans(narek, anna);
    }

    private static void printHumans(final Human... humans) {
        for (Human human : humans) {
            System.out.println(human);
            human.foo();
        }
    }
}
