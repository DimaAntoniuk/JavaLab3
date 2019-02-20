package ua.lviv.iot.museum.models;

public class Painting extends Exhibit {

    private Style paintingStyle;
    private boolean frame;

    public Painting() {}

    public Painting(Style paintingStyle, boolean frame) {
        this.paintingStyle = paintingStyle;
        this.frame = frame;
    }

    public Style getPaintingStyle() {
        return paintingStyle;
    }

    public void setPaintingStyle(Style paintingStyle) {
        this.paintingStyle = paintingStyle;
    }

    public boolean isFrame() {
        return frame;
    }

    public void setFrame(boolean frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "paintingStyle=" + paintingStyle +
                ", frame=" + frame +
                '}';
    }
}
