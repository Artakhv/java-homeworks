package javaBasic.EXERCISES_2.task_2;

class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    Clock() {
        this(12, 0, 0);
    }

    Clock(final int secondsSinceMidnight) {
        this(
                calculateHoursFromSecondSinceMidnight(secondsSinceMidnight),
                calculateMinutesFromSecondSinceMidnight(secondsSinceMidnight),
                calculateSecondsFromSecondSinceMidnight(secondsSinceMidnight)
        );
    }

    Clock(final int hours, final int minutes, final int seconds) {
        validateState(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        validateHours(hours);
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format(
                "%02d:%02d:%02d",
                getHours(),
                getMinutes(),
                getSeconds()
        );
    }

    void setClock(final int secondsSinceMidnight) {
        setHours(calculateHoursFromSecondSinceMidnight(secondsSinceMidnight));
        setMinutes(calculateMinutesFromSecondSinceMidnight(secondsSinceMidnight));
        setSeconds(calculateSecondsFromSecondSinceMidnight(secondsSinceMidnight));
    }

    void tick() {
        final int currentSecondsFromMidnight = extractSecondsFromMidnight();
        setClock(currentSecondsFromMidnight + 1);
    }

    void tickDown() {
        final int currentSecondsFromMidnight = extractSecondsFromMidnight();
        setClock(currentSecondsFromMidnight - 1);
    }

    void addClock(final Clock anotherClock) {
        final int currentSecondsSinceMidnight = this.extractSecondsFromMidnight();
        final int anotherSecondsSinceMidnight = anotherClock.extractSecondsFromMidnight();
        setClock(currentSecondsSinceMidnight + anotherSecondsSinceMidnight);
    }

    Clock subtractClock(final Clock anotherClock) {
        final int currentSecondsSinceMidnight = this.extractSecondsFromMidnight();
        final int anotherSecondsSinceMidnight = anotherClock.extractSecondsFromMidnight();
        final int secondsDifferenceSinceMidnight = Math.abs(currentSecondsSinceMidnight - anotherSecondsSinceMidnight);
        return new Clock(secondsDifferenceSinceMidnight);
    }

    private int extractSecondsFromMidnight() {
        return (this.hours * 60 * 60) + (this.minutes * 60) + this.seconds;
    }

    private static int calculateHoursFromSecondSinceMidnight(final int secondsSinceMidnight) {
        return (secondsSinceMidnight / (60 * 60)) % 24;
    }

    private static int calculateMinutesFromSecondSinceMidnight(final int secondsSinceMidnight) {
        return (secondsSinceMidnight / 60) % 60;
    }

    private static int calculateSecondsFromSecondSinceMidnight(final int secondsSinceMidnight) {
        return secondsSinceMidnight % 60;
    }

    private static void validateState(final int hours, final int minutes, final int seconds) {
        validateHours(hours);
        validateMinutes(minutes);
        validateSeconds(seconds);
    }

    private static void validateHours(int hours) {
        if (hours > 23 || hours < 0) {
            throw new IllegalArgumentException("Hours must be in range [0-23]");
        }
    }

    private static void validateMinutes(int minutes) {
        if (minutes > 59 || minutes < 0) {
            throw new IllegalArgumentException("Minutes must be in range [0-59]");
        }
    }

    private static void validateSeconds(int seconds) {
        if (seconds > 59 || seconds < 0) {
            throw new IllegalArgumentException("Seconds must be in range [0-59]");
        }
    }
}