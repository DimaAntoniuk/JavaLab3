package ua.lviv.iot.museum.models;

public class Exhibition {

    private Date startDate;
    private Date endDate;
    private Exhibit[] exhibits;
    private String name;
    private Topic theme;
    private Museum currentMuseum;

    public Exhibition(final Date startDateArg, final Date endDateArg,
                      final Exhibit[] exhibitsArg, final String nameArg,
                      final Topic themeArg, final Museum currentMuseumArg) {
        this.startDate = startDateArg;
        this.endDate = endDateArg;
        this.exhibits = exhibitsArg;
        this.name = nameArg;
        this.theme = themeArg;
        this.currentMuseum = currentMuseumArg;
    }

    public Exhibition() {
        exhibits = new Exhibit[1];
        exhibits[0] = new Exhibit();
    }

    public final Date getStartDate() {
        return startDate;
    }

    public final void setStartDate(final Date startDateArg) {
        this.startDate = startDateArg;
    }

    public final Date getEndDate() {
        return endDate;
    }

    public final void setEndDate(final Date endDateArg) {
        this.endDate = endDateArg;
    }

    public final Exhibit[] getExhibits() {
        return exhibits;
    }

    public final void setExhibits(final Exhibit... exhibitsArg) {
        this.exhibits = exhibitsArg;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String nameArg) {
        this.name = nameArg;
    }

    public final Topic getTheme() {
        return theme;
    }

    public final void setTheme(final Topic themeArg) {
        this.theme = themeArg;
    }

    public final Museum getCurrentMuseum() {
        return currentMuseum;
    }

    public final void setCurrentMuseum(final Museum currentMuseumArg) {
        this.currentMuseum = currentMuseumArg;
    }
}
