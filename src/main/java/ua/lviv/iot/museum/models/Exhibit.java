package ua.lviv.iot.museum.models;

public class Exhibit {

    private String name;
    private boolean portable;
    private int centuryOfCreation;
    private String countryOfCreaetion;
    private Volume size;
    private InterestedPeople popularity;
    private Topic theme;
    private double destroyedInPercentage;
    private Date startDateInCurrentExhibition;

    public Exhibit() { }

    public Exhibit(final String nameArg, final boolean portableArg,
                   final int centuryOfCreationArg,
                   final String countryOfCreaetionArg,
                   final Volume sizeArg, final InterestedPeople popularityArg,
                   final Topic themeAgr, final double destroyedInPercentageArg,
                   final Date startDateInCurrentExhibitionArg) {
        this.name = nameArg;
        this.portable = portableArg;
        this.centuryOfCreation = centuryOfCreationArg;
        this.countryOfCreaetion = countryOfCreaetionArg;
        this.size = sizeArg;
        this.popularity = popularityArg;
        this.theme = themeAgr;
        this.destroyedInPercentage = destroyedInPercentageArg;
        this.startDateInCurrentExhibition = startDateInCurrentExhibitionArg;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String nameArg) {
        this.name = nameArg;
    }

    public final boolean isPortable() {
        return portable;
    }

    public final void setPortable(final boolean portableArg) {
        this.portable = portableArg;
    }

    public final int getCenturyOfCreation() {
        return centuryOfCreation;
    }

    public final void setCenturyOfCreation(final int centuryOfCreationArg) {
        this.centuryOfCreation = centuryOfCreationArg;
    }

    public final String getCountryOfCreaetion() {
        return countryOfCreaetion;
    }

    public final void setCountryOfCreaetion(
            final String countryOfCreaetionArg) {
        this.countryOfCreaetion = countryOfCreaetionArg;
    }

    public final Volume getSize() {
        return size;
    }

    public final void setSize(final Volume sizeArg) {
        this.size = sizeArg;
    }

    public final InterestedPeople getPopularity() {
        return popularity;
    }

    public final void setPopularity(final InterestedPeople popularityArg) {
        this.popularity = popularityArg;
    }

    public final Topic getTheme() {
        return theme;
    }

    public final void setTheme(final Topic themeArg) {
        this.theme = themeArg;
    }

    public final double getDestroyedInPercentage() {
        return destroyedInPercentage;
    }

    public final void setDestroyedInPercentage(
            final double destroyedInPercentageArg) {
        this.destroyedInPercentage = destroyedInPercentageArg;
    }

    public final Date getStartDateInCurrentExhibition() {
        return startDateInCurrentExhibition;
    }

    public final void setStartDateInCurrentExhibition(
            final Date startDateInCurrentExhibitionArg) {
        this.startDateInCurrentExhibition = startDateInCurrentExhibitionArg;
    }

    @Override
    public String toString() {
        return "Exhibit{"
                + "name='" + name + '\''
                + ", portable=" + portable
                + ", centuryOfCreation=" + centuryOfCreation
                + ", countryOfCreaetion='" + countryOfCreaetion + '\''
                + ", size=" + size
                + ", popularity=" + popularity
                + ", theme=" + theme
                + ", destroyedInPercentage=" + destroyedInPercentage
                + ", startDateInCurrentExhibition="
                + startDateInCurrentExhibition.getDay()
                + "." + startDateInCurrentExhibition.getMonth()
                + "." + startDateInCurrentExhibition.getYear()
                + '}';
    }
}
