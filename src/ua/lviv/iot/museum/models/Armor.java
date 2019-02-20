package ua.lviv.iot.museum.models;

public class Armor extends Exhibit {

    private boolean madeOfMetal;
    private boolean pattren;
    private Suit suit;

    public Armor() {}

    public Armor(boolean madeOfMetal, boolean pattren, Suit suit) {
        this.madeOfMetal = madeOfMetal;
        this.pattren = pattren;
        this.suit = suit;
    }

    public boolean isMadeOfMetal() {
        return madeOfMetal;
    }

    public void setMadeOfMetal(boolean madeOfMetal) {
        this.madeOfMetal = madeOfMetal;
    }

    public boolean isPattren() {
        return pattren;
    }

    public void setPattren(boolean pattren) {
        this.pattren = pattren;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "madeOfMetal=" + madeOfMetal +
                ", pattren=" + pattren +
                ", suit=" + suit +
                '}';
    }
}
