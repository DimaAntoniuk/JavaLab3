package ua.lviv.iot.museum.models;

public class Vase extends Exhibit {

    private String material;
    private boolean painted;

    public Vase() { }

    public Vase(final String materialArg, final boolean paintedArg) {
        this.material = materialArg;
        this.painted = paintedArg;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String materialArg) {
        this.material = materialArg;
    }

    public final boolean isPainted() {
        return painted;
    }

    public final void setPainted(final boolean paintedArg) {
        this.painted = paintedArg;
    }

    @Override
    public final String toString() {
        return "Vase{"
                + "material='" + material + '\''
                + ", painted=" + painted
                + '}';
    }

    public final String getHeaders() {
        return super.getHeaders() + ','
                + "material" + ','
                + "painted" + '\n';
    }

    public final String toCSV() {
        return super.toCSV() + ','
                + material + ','
                + painted + '\n';
    }
}
