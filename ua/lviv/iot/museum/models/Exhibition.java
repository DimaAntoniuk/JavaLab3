package ua.lviv.iot.museum.models;

public class Exhibition {

    private Date startDate;
    private Date endDate;
    private Exhibit[] exhibits;
    private String name;
    private Topic theme;
    private Museum currentMuseum;

    public Exhibition(Date startDate, Date endDate, Exhibit[] exhibits, String name, Topic theme,
                      Museum currentMuseum) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.exhibits = exhibits;
        this.name = name;
        this.theme = theme;
        this.currentMuseum = currentMuseum;
    }

    public Exhibition() {

        exhibits = new Exhibit[1];
        exhibits[0] = new Exhibit();

    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Exhibit[] getExhibits() {
        return exhibits;
    }

    public void setExhibits(Exhibit... exhibits) {
        this.exhibits = exhibits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getTheme() {
        return theme;
    }

    public void setTheme(Topic theme) {
        this.theme = theme;
    }

    public Museum getCurrentMuseum() {
        return currentMuseum;
    }

    public void setCurrentMuseum(Museum currentMuseum) {
        this.currentMuseum = currentMuseum;
    }
}
