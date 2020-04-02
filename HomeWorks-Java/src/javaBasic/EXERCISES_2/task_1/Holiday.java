package javaBasic.EXERCISES_2.task_1;

public class Holiday {
    private final String name;
    private final int day;
    private final Month month;

    ////////// 1
    public Holiday(final String name, final int day, final int month) {
        this.name = name;
        this.day = day;
        this.month = Month.getByNumber(month);
    }
    ////////// 1

    final public String getName() {
        return name;
    }

    final public int getDay() {
        return day;
    }

    final public Month getMonth() {
        return month;
    }

    final public boolean isInSameMonth(final Holiday holiday) {
        return this.getMonth().equals(holiday.getMonth());
    }

    final public double avgDate(final Holiday[] holidays) throws IllegalArgumentException {
        double sum = 0;
        for (int i = 0; i < holidays.length; i++) {
            sum += holidays[i].getDay();
        }
        return sum / holidays.length;
    }
}
