package ua.lviv.iot.museum.models;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date() {}

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(Date date) {
        Integer thisYear = this.year;
        Integer objYear = date.year;

        int sComp = thisYear.compareTo(objYear);

        if(sComp != 0) {
            return sComp;
        }

        Integer thisMonth = this.month;
        Integer objMonth = date.month;

        sComp = thisMonth.compareTo(objMonth);

        if(sComp != 0) {
            return sComp;
        }

        Integer thisDay = this.day;
        Integer dateDay = date.day;

        return thisDay.compareTo(dateDay);

    }
}
