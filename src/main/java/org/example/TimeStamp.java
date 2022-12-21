package org.example;

public class TimeStamp {
    final String day;
    final String month;
    final String year;
    final String hour;
    final String minute;
    final String second;

    public TimeStamp(String day, String month, String year, String hour, String minute, String second) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    public String getSecond() {
        return second;
    }
}

