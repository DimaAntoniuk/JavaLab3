package ua.lviv.iot.museum.models;

import javax.persistence.Embeddable;

@Embeddable
public class Volume {

    private double height;
    private double width;
    private double length;
    private double weigth;

    public Volume() { }

    public Volume(final double heightArg, final double widthArg,
                  final double lengthArg, final double weigthArg) {
        this.height = heightArg;
        this.width = widthArg;
        this.length = lengthArg;
        this.weigth = weigthArg;
    }

    public final double getHeight() {
        return height;
    }

    public final void setHeight(final double heightArg) {
        this.height = heightArg;
    }

    public final double getWidth() {
        return width;
    }

    public final void setWidth(final double widthArg) {
        this.width = widthArg;
    }

    public final double getLength() {
        return length;
    }

    public final void setLength(final double lengthArg) {
        this.length = lengthArg;
    }

    public final double getWeigth() {
        return weigth;
    }

    public final void setWeigth(final double weigthArg) {
        this.weigth = weigthArg;
    }
}
