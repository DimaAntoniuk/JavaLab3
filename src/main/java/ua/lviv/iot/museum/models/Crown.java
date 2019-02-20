package ua.lviv.iot.museum.models;

public class Crown extends Exhibit {

    private boolean insertion;
    private int numberOfDiamonds;

    public Crown() {}

    public Crown(boolean insertion, int numberOfDiamonds) {
        this.insertion = insertion;
        this.numberOfDiamonds = numberOfDiamonds;
    }

    public boolean isInsertion() {
        return insertion;
    }

    public void setInsertion(boolean insertion) {
        this.insertion = insertion;
    }

    public int getNumberOfDiamonds() {
        return numberOfDiamonds;
    }

    public void setNumberOfDiamonds(int numberOfDiamonds) {
        this.numberOfDiamonds = numberOfDiamonds;
    }

    @Override
    public String toString() {
        return "Crown{" +
                "insertion=" + insertion +
                ", numberOfDiamonds=" + numberOfDiamonds +
                '}';
    }
}
