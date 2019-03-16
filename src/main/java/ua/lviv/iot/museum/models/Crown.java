package ua.lviv.iot.museum.models;

public class Crown extends Exhibit {

    private boolean insertion;
    private int numberOfDiamonds;

    public Crown() { }

    public Crown(final boolean insertionArg, final int numberOfDiamondsArg) {
        this.insertion = insertionArg;
        this.numberOfDiamonds = numberOfDiamondsArg;
    }

    public final boolean getInsertion() {
        return insertion;
    }

    public final void setInsertion(final boolean insertionArg) {
        this.insertion = insertionArg;
    }

    public final int getNumberOfDiamonds() {
        return numberOfDiamonds;
    }

    public final void setNumberOfDiamonds(final int numberOfDiamondsArg) {
        this.numberOfDiamonds = numberOfDiamondsArg;
    }

    @Override
    public final String toString() {
        return "Crown{"
                + "insertion=" + insertion
                + ", numberOfDiamonds=" + numberOfDiamonds
                + '}';
    }

    public final String getHeaders() {
        return super.getHeaders() + ','
                + "insertion" + ','
                + "numberOfDiamonds" + '\n';
    }

    public final String toCSV() {
        return super.toCSV() + ','
                + insertion + ','
                + numberOfDiamonds + '\n';
    }
}
