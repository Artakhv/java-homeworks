package javaBasic.EXERCISES_2.task_1;

public enum Month {
    JANUARY(0),
    FEBRUARY(1),
    MARCH(2),
    APRIL(3),
    MAY(4),
    JUNE(5),
    JULE(6),
    AUGUST(7),
    SEPTEMBER(8),
    OCTOBER(9),
    NOVEMBER(10),
    DECEMBER(11);

    private final int number;

    Month(final int month) {
        this.number = month;
    }

    public static Month getByNumber(final int number) {
        final Month[] availableWeekDays = Month.values();
        for (final Month weekDay : availableWeekDays) {
            if (weekDay.number == number) {
                return weekDay;
            }
        }
        throw new IllegalArgumentException("We don't support such number.");
    }
}
