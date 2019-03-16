package ua.lviv.iot.museum.models;

public class Painting extends Exhibit {

    private Style paintingStyle;
    private boolean frame;

    public Painting() { }

    public Painting(final Style paintingStyleArg, final boolean frameArg) {
        this.paintingStyle = paintingStyleArg;
        this.frame = frameArg;
    }

    public Painting(final String name, final boolean portable,
                 final int centuryOfCreation, final String countryOfCreation,
                 final Volume size, final InterestedPeople popularity,
                 final Topic theme, final double destroyedInPercentage,
                 final Date startDateInCurrentExhibition,
                 final Style paintingStyleArg, final boolean frameArg) {
        super(name, portable, centuryOfCreation, countryOfCreation,
                size, popularity, theme, destroyedInPercentage,
                startDateInCurrentExhibition);
        this.paintingStyle = paintingStyleArg;
        this.frame = frameArg;
    }

    public final Style getPaintingStyle() {
        return paintingStyle;
    }

    public final void setPaintingStyle(final Style paintingStyleArg) {
        this.paintingStyle = paintingStyleArg;
    }

    public final boolean isFrame() {
        return frame;
    }

    public final void setFrame(final boolean frameArg) {
        this.frame = frameArg;
    }

    @Override
    public final String toString() {
        return "Painting{"
                + "paintingStyle=" + paintingStyle
                + ", frame=" + frame
                + '}';
    }

    public final String getHeaders() {
        return super.getHeaders() + ','
                + "paintingStyle" + ','
                + "frame";
    }

    public final String toCSV() {
        return super.toCSV() + ','
                + paintingStyle + ','
                + frame;
    }
}
