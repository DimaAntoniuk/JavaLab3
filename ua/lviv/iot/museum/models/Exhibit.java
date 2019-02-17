package ua.lviv.iot.museum.models;

public class Exhibit{

    private String name;
    private boolean portable;
    private int centuryOfCreation;
    private String countryOfCreaetion;
    private Volume size;
    private InterestedPeople popularity;
    private Topic theme;
    private double destroyedInPercentage;
    private Date startDateInCurrentExhibition;

    public Exhibit() {}

    public Exhibit(String name, boolean portable, int centuryOfCreation, String countryOfCreaetion,
                   Volume size, InterestedPeople popularity, Topic theme, double destroyedInPercentage,
                   Date startDateInCurrentExhibition) {
        this.name = name;
        this.portable = portable;
        this.centuryOfCreation = centuryOfCreation;
        this.countryOfCreaetion = countryOfCreaetion;
        this.size = size;
        this.popularity = popularity;
        this.theme = theme;
        this.destroyedInPercentage = destroyedInPercentage;
        this.startDateInCurrentExhibition = startDateInCurrentExhibition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public int getCenturyOfCreation() {
        return centuryOfCreation;
    }

    public void setCenturyOfCreation(int centuryOfCreation) {
        this.centuryOfCreation = centuryOfCreation;
    }

    public String getCountryOfCreaetion() {
        return countryOfCreaetion;
    }

    public void setCountryOfCreaetion(String countryOfCreaetion) {
        this.countryOfCreaetion = countryOfCreaetion;
    }

    public Volume getSize() {
        return size;
    }

    public void setSize(Volume size) {
        this.size = size;
    }

    public InterestedPeople getPopularity() {
        return popularity;
    }

    public void setPopularity(InterestedPeople popularity) {
        this.popularity = popularity;
    }

    public Topic getTheme() {
        return theme;
    }

    public void setTheme(Topic theme) {
        this.theme = theme;
    }

    public double getDestroyedInPercentage() {
        return destroyedInPercentage;
    }

    public void setDestroyedInPercentage(double destroyedInPercentage) {
        this.destroyedInPercentage = destroyedInPercentage;
    }

    public Date getStartDateInCurrentExhibition() {
        return startDateInCurrentExhibition;
    }

    public void setStartDateInCurrentExhibition(Date startDateInCurrentExhibition) {
        this.startDateInCurrentExhibition = startDateInCurrentExhibition;
    }

    @Override
    public String toString() {
        return "Exhibit{" +
                "name='" + name + '\'' +
                ", portable=" + portable +
                ", centuryOfCreation=" + centuryOfCreation +
                ", countryOfCreaetion='" + countryOfCreaetion + '\'' +
                ", size=" + size +
                ", popularity=" + popularity +
                ", theme=" + theme +
                ", destroyedInPercentage=" + destroyedInPercentage +
                ", startDateInCurrentExhibition=" + startDateInCurrentExhibition.getDay() +
                "." + startDateInCurrentExhibition.getMonth() +
                "." + startDateInCurrentExhibition.getYear() +
                '}';
    }
}
