package javaBasic.EXERCISES_3;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Util {
    public static long getTimeNowInMileSeconds() {
        LocalDateTime now = LocalDateTime.now();
        return Timestamp.valueOf(now).getTime();
    }

    public static <String> String[] append(String[] arr, String element) {
        String[] array = Arrays.copyOf(arr, arr.length + 1);
        array[arr.length] = element;
        return array;
    }

    public static String generateRandomString() {
        // A == 65
        // Z == 90
        // a == 97
        // z == 122
        final int capitalIndex = getIntsFromBetween(65, 90);
        final int lengthOfString = getIntsFromBetween(5, 9);
        String randomString = charToString(capitalIndex);
        for (int i = 0; i < lengthOfString; i++) {
            int smallIndex = getIntsFromBetween(97, 122);
            randomString += charToString(smallIndex);
//            System.out.println(randomString);
        }
        return randomString;
    }

    private static int getIntsFromBetween(final int from, final int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    private static String charToString(final int index) {
        return Character.toString(index);
    }

    public static long getMileSecondsDifferenceInNSeconds(final  int n) throws InterruptedException {
        final long startDateInMileSeconds = Util.getTimeNowInMileSeconds();
        Thread.sleep(n * 1000);
        final long endDateInMileSeconds = Util.getTimeNowInMileSeconds();
        return endDateInMileSeconds - startDateInMileSeconds;
    }
}
