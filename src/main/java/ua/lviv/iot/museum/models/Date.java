package ua.lviv.iot.museum.models;

public class Date implements Comparable<Date> {

    private int day;
    private int month;
    private int year;

    public Date() { }

    public Date(final int dayArg, final int monthArg, final int yearArg) {
        this.day = dayArg;
        this.month = monthArg;
        this.year = yearArg;
    }

    public final int getDay() {
        return day;
    }

    public final void setDay(final int dayArg) {
        this.day = dayArg;
    }

    public final int getMonth() {
        return month;
    }

    public final void setMonth(final int monthArg) {
        this.month = monthArg;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(final int yearArg) {
        this.year = yearArg;
    }

    @Override
    public final int compareTo(final Date date) {
        Integer thisYear = this.year;
        Integer objYear = date.year;

        int compare = thisYear.compareTo(objYear);

        if (compare != 0) {
            return compare;
        }

        Integer thisMonth = this.month;
        Integer objMonth = date.month;

        compare = thisMonth.compareTo(objMonth);

        if (compare != 0) {
            return compare;
        }

        Integer thisDay = this.day;
        Integer objDay = date.day;

        return thisDay.compareTo(objDay);
    }
}
