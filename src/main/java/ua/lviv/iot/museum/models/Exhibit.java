package ua.lviv.iot.museum.models;

import javax.persistence.*;


@Entity
@Inheritance
public class Exhibit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private boolean portable;
    private int centuryOfCreation;
    private String countryOfCreation;

    @Embedded
    @AttributeOverrides(value = {@AttributeOverride(name = "height", column = @Column(name = "height")),
            @AttributeOverride(name = "width", column = @Column(name = "width")),
            @AttributeOverride(name = "length", column = @Column(name = "length")),
            @AttributeOverride(name = "weight", column = @Column(name = "weight"))
    })
    private Volume size;
    @Enumerated(EnumType.STRING)
    private InterestedPeople popularity;
    @Enumerated(EnumType.STRING)
    private Topic theme;
    private double destroyedInPercentage;

    @Embedded
    @AttributeOverrides(value = {@AttributeOverride(name = "day", column = @Column(name = "day")),
            @AttributeOverride(name = "month", column = @Column(name = "month")),
            @AttributeOverride(name = "year", column = @Column(name = "year"))
    })
    private Date startDateInCurrentExhibition;

    public Exhibit() { }

    public Exhibit(final String nameArg, final boolean portableArg,
                   final int centuryOfCreationArg,
                   final String countryOfCreationArg,
                   final Volume sizeArg, final InterestedPeople popularityArg,
                   final Topic themeAgr, final double destroyedInPercentageArg,
                   final Date startDateInCurrentExhibitionArg) {
        this.name = nameArg;
        this.portable = portableArg;
        this.centuryOfCreation = centuryOfCreationArg;
        this.countryOfCreation = countryOfCreationArg;
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

    public final String getCountryOfCreation() {
        return countryOfCreation;
    }

    public final void setCountryOfCreation(
            final String countryOfCreationArg) {
        this.countryOfCreation = countryOfCreationArg;
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
    public final Integer getId() {
        return id;
    }

    public final void setId(final Integer idArg) {
        this.id = idArg;
    }


    @Override
    public String toString() {
        return "Exhibit{"
                + "name='" + name + '\''
                + ", portable=" + portable
                + ", centuryOfCreation=" + centuryOfCreation
                + ", countryOfCreaetion='" + countryOfCreation + '\''
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

    public String getHeaders() {
        return "name" + ','
                + "portable" + ','
                + "centuryOfCreation" + ','
                + "countryOfCreation" + ','
                + "size" + ','
                + "popularity" + ','
                + "theme" + ','
                + "destroyedInPercentage" + ','
                + "startDateInCurrentExhibition";
    }

    public String toCSV() {
        return name + ',' + portable + ',' + centuryOfCreation + ','
                + countryOfCreation + ',' + ',' + size + ',' + popularity + ','
                + theme + ',' + destroyedInPercentage + ','
                + startDateInCurrentExhibition.getDay() + ','
                + startDateInCurrentExhibition.getMonth() + ','
                + startDateInCurrentExhibition.getYear();
    }
}
