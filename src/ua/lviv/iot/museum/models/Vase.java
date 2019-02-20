package ua.lviv.iot.museum.models;

public class Vase extends Exhibit {

    private String material;
    private boolean painted;

    public Vase() {}

    public Vase(String material, boolean painted) {
        this.material = material;
        this.painted = painted;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isPainted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }

    @Override
    public String toString() {
        return "Vase{" +
                "material='" + material + '\'' +
                ", painted=" + painted +
                '}';
    }
}
