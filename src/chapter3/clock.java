package chapter3;

public class clock {
    // Instance variables
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize the three instance variables
    public clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Setters and Getters for each instance variable
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    // Method to display time in "hh:mm:ss" format
    public double displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
        return 0;
    }
}



