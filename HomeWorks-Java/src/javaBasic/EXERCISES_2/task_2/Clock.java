package javaBasic.EXERCISES_2.task_2;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private int clockInSeconds = 0;

    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    public Clock(final int seconds) {
        setClock(seconds);
    }

    public Clock(final int hours, final int minutes, final int seconds) {
        clockInSeconds = (hours * 3600) + (minutes * 60) + (seconds);
        this.hours = (hours >= 0 && hours <= 23) ? hours : hours % 24;
        this.minutes = (minutes >= 0 && minutes <= 59) ? minutes : minutes % 60;
        this.seconds = (seconds >= 0 && seconds <= 59) ? seconds : seconds % 60;

    }

    final public int getHours() {
        return hours;
    }

    final public int getMinutes() {
        return minutes;
    }

    final public int getSeconds() {
        return seconds;
    }

    final public int getClockInSeconds() {
        return clockInSeconds;
    }

    final public void setHours(int hours) {
        this.hours = hours;
    }

    final public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    final public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    final public void setClock(final int seconds) {
        clockInSeconds += seconds;
        this.hours = clockInSeconds / (60 * 60);
        this.minutes = (clockInSeconds / 60) % 60;
        this.seconds = clockInSeconds % 60;
    }

    final public void tick() {
        setClock(1);
    }

    final public void tickDown() {
        setClock(-1);
    }

    final public void addClock(Clock newClock) {
        final int totalSeconds = this.clockInSeconds + newClock.getClockInSeconds(); /// not work
        setClock(totalSeconds);
    }

    final public Clock subtractClock(Clock newClock) {
        final int totalSeconds = newClock.getClockInSeconds() - this.clockInSeconds;
        return new Clock(totalSeconds);
    }


    @Override
    public String toString() {
        String hoursStr = (hours >= 0 && hours < 10) ? "0" + hours : String.valueOf(hours);
        String minutesStr = (minutes >= 0 && minutes < 10) ? "0" + minutes : String.valueOf(minutes);
        String secondsStr = (seconds >= 0 && seconds < 10) ? "0" + seconds : String.valueOf(seconds);
        return String.format("%s:%s:%s", hoursStr, minutesStr, secondsStr);
    }
}
