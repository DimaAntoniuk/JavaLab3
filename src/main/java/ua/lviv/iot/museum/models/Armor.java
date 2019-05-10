package ua.lviv.iot.museum.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Armor extends Exhibit {

    private boolean madeOfMetal;
    private boolean pattern;
    @Enumerated(EnumType.STRING)
    private Suit suit;

    public Armor() { }

    public Armor(final boolean madeOfMetalArg, final boolean patternArg,
                 final Suit suitArg) {
        this.madeOfMetal = madeOfMetalArg;
        this.pattern = patternArg;
        this.suit = suitArg;
    }

    public Armor(final String name, final boolean portable,
                 final int centuryOfCreation, final String countryOfCreation,
                 final Volume size, final InterestedPeople popularity,
                 final Topic theme, final double destroyedInPercentage,
                 final Date startDateInCurrentExhibition,
                 final boolean madeOfMetalArg, final boolean patternArg,
                 final Suit suitArg) {
        super(name, portable, centuryOfCreation, countryOfCreation,
                size, popularity, theme, destroyedInPercentage,
                startDateInCurrentExhibition);
        this.madeOfMetal = madeOfMetalArg;
        this.pattern = patternArg;
        this.suit = suitArg;
    }

    public final boolean isMadeOfMetal() {
        return madeOfMetal;
    }

    public final void setMadeOfMetal(final boolean madeOfMetalArg) {
        this.madeOfMetal = madeOfMetalArg;
    }

    public final boolean isPattern() {
        return pattern;
    }

    public final void setPattern(final boolean patternArg) {
        this.pattern = patternArg;
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
                + ", pattern=" + pattern
                + ", suit=" + suit
                + '}';
    }

    public final String getHeaders() {
        return super.getHeaders() + ','
                + "madeOfMetal" + ','
                + "pattern" + ','
                + "suit";
    }

    public final String toCSV() {
        return super.toCSV() + ','
                + madeOfMetal + ','
                + pattern + ','
                + suit;
    }
}
