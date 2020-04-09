package javaBasic.EXERCISES_3;

import static javaBasic.EXERCISES_3.Util.*;

public class Randomizer {
    public static void main(String[] args) throws InterruptedException {
        final int seconds;
        seconds =  Integer.parseInt(args[0]);
        final long diff = getMileSecondsDifferenceInNSeconds(seconds);
        final Basket basket = new Basket();
        addItemsToBasket(diff, basket);
        System.out.println(basket);
    }

    private static void addItemsToBasket(long diff, final Basket basket) {
        while (diff > 0) {
            String string = generateRandomString();
            basket.addString(string);
            diff--;
        }
    }
}
