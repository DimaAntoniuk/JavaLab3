package ua.lviv.iot.museum.models;

public class Armor extends Exhibit {

    private boolean madeOfMetal;
    private boolean pattren;
    private Suit suit;

    public Armor() { }

    public Armor(final boolean madeOfMetalArg, final boolean pattrenArg,
                 final Suit suitArg) {
        this.madeOfMetal = madeOfMetalArg;
        this.pattren = pattrenArg;
        this.suit = suitArg;
    }

    public final boolean isMadeOfMetal() {
        return madeOfMetal;
    }

    public final void setMadeOfMetal(final boolean madeOfMetalArg) {
        this.madeOfMetal = madeOfMetalArg;
    }

    public final boolean isPattren() {
        return pattren;
    }

    public final void setPattren(final boolean pattrenArg) {
        this.pattren = pattrenArg;
    }

    public final Suit getSuit() {
        return suit;
    }

    public final void setSuit(final Suit suitArg) {
        this.suit = suitArg;
    }

    @Override
    public final String toString() {
        return "Armor{"
                + "madeOfMetal=" + madeOfMetal
                + ", pattren=" + pattren
                + ", suit=" + suit
                + '}';
    }
}
