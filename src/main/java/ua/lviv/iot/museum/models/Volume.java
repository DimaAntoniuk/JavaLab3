package ua.lviv.iot.museum.models;

public class Volume {

    private double height;
    private double width;
    private double length;
    private double weigth;

    public Volume() {}

    public Volume(double height, double width, double length, double weigth) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weigth = weigth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }



}
