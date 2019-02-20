package ua.lviv.iot.museum.models;

public class Museum {

    private String location;
    private double exhibitionSpace;
    private String name;
    private int yearOfFundation;
    private int numberOfHalls;
    private Exhibition[] exhibitions;

    public Museum() {}

    public Museum(String location, double exhibitionSpace, String name, int yearOfFundation,
                  int numberOfHalls, Exhibition[] exhibitions) {
        this.location = location;
        this.exhibitionSpace = exhibitionSpace;
        this.name = name;
        this.yearOfFundation = yearOfFundation;
        this.numberOfHalls = numberOfHalls;
        this.exhibitions = exhibitions;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getExhibitionSpace() {
        return exhibitionSpace;
    }

    public void setExhibitionSpace(double exhibitionSpace) {
        this.exhibitionSpace = exhibitionSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFundation() {
        return yearOfFundation;
    }

    public void setYearOfFundation(int yearOfFundation) {
        this.yearOfFundation = yearOfFundation;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    public Exhibition[] getExhibitions() {
        return exhibitions;
    }

    public void setExhibitions(Exhibition... exhibitions) {
        this.exhibitions = exhibitions;
    }
}
