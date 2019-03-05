package ua.lviv.iot.museum.models;

import java.util.ArrayList;
import java.util.List;

public class Museum {

    private String location;
    private double exhibitionSpace;
    private String name;
    private int yearOfFundation;
    private int numberOfHalls;
    private List<Exhibition> exhibitions;

    public Museum() {
        exhibitions = new ArrayList<>();
    }

    public Museum(final String locationArg, final double exhibitionSpaceArg,
                  final String nameArg, final int yearOfFundationArg,
                  final int numberOfHallsArg,
                  final ArrayList<Exhibition> exhibitionsArg) {
        this.location = locationArg;
        this.exhibitionSpace = exhibitionSpaceArg;
        this.name = nameArg;
        this.yearOfFundation = yearOfFundationArg;
        this.numberOfHalls = numberOfHallsArg;
        this.exhibitions = exhibitionsArg;
    }

    public final String getLocation() {
        return location;
    }

    public final void setLocation(final String locationArg) {
        this.location = locationArg;
    }

    public final double getExhibitionSpace() {
        return exhibitionSpace;
    }

    public final void setExhibitionSpace(final double exhibitionSpaceArg) {
        this.exhibitionSpace = exhibitionSpaceArg;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String nameArg) {
        this.name = nameArg;
    }

    public final int getYearOfFundation() {
        return yearOfFundation;
    }

    public final void setYearOfFundation(final int yearOfFundationArg) {
        this.yearOfFundation = yearOfFundationArg;
    }

    public final int getNumberOfHalls() {
        return numberOfHalls;
    }

    public final void setNumberOfHalls(final int numberOfHallsArg) {
        this.numberOfHalls = numberOfHallsArg;
    }

    public final List<Exhibition> getExhibitions() {
        return exhibitions;
    }

    public final void setExhibitions(
            final ArrayList<Exhibition> exhibitionsArg) {
        this.exhibitions = exhibitionsArg;
    }

    public final void addExhibition(final Exhibition exhibitionArg) {
        this.exhibitions.add(exhibitionArg);
    }
}
