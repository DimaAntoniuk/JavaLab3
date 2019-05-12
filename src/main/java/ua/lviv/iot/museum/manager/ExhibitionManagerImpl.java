package ua.lviv.iot.museum.manager;

import ua.lviv.iot.museum.models.Exhibit;
import ua.lviv.iot.museum.models.Topic;
import ua.lviv.iot.museum.models.Exhibition;
import ua.lviv.iot.museum.models.Museum;
import ua.lviv.iot.museum.models.Date;
import ua.lviv.iot.museum.models.Armor;
import ua.lviv.iot.museum.models.Suit;
import ua.lviv.iot.museum.models.Vase;
import ua.lviv.iot.museum.models.Crown;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExhibitionManagerImpl implements ExhibitionManager {

    private static final int NUMBER_OF_DIAMONDS = 7;
    private static final int HELMET_DAY = 17;
    private static final int HELMET_YEAR = 2018;
    private static final int VASE_DAY = 15;
    private static final int VASE_YEAR = 2018;
    private static final int CROWN_DAY = 13;
    private static final int CROWN_YEAR = 2019;
    private static final int ARMOR_CENTURY_OF_CREATION = 19;
    private static final int VASE_CENTURY_OF_CREATION = 17;
    private static final int CROWN_CENTURY_OF_CREATION = 15;


    public final List<Exhibit> findByTheme(final List<Exhibit> listOfExhibits,
                                                  final Topic theme) {

        return listOfExhibits.stream().filter(exhibit ->
                exhibit.getTheme() == theme).collect(Collectors.toList());
    }


    public final List<Exhibit> sortByAge(final List<Exhibit> listOfExhibits,
                                                final boolean reverse) {

        if (reverse) {
            Collections.sort(listOfExhibits, Comparator.comparing(
                    Exhibit::getCenturyOfCreation).reversed());
        } else {
            Collections.sort(listOfExhibits, Comparator.comparing(
                    Exhibit::getCenturyOfCreation));
        }
        return listOfExhibits;

    }

    public final List<Exhibit> sortByTimeInCurrentExhibition(
            final List<Exhibit> listOfExhibits, final boolean reverse) {

        if (reverse) {
            listOfExhibits.sort((o1, o2) -> {
                Date firstExhibitTime = o1.getStartDateInCurrentExhibition();
                Date secondExhibitTime = o2.getStartDateInCurrentExhibition();
                return firstExhibitTime.compareTo(secondExhibitTime);
            });
            return listOfExhibits;
        } else {
            listOfExhibits.sort((o1, o2) -> {
                Date firstExhibitTime  = o1.getStartDateInCurrentExhibition();
                Date secondExhibitTime = o2.getStartDateInCurrentExhibition();
                return firstExhibitTime.compareTo(secondExhibitTime);
            });
            return listOfExhibits;
        }
    }

    public static void main(final String[] args) {




        Museum museum = new Museum();
        Exhibition exhibitionAncientRome = new Exhibition();
        Exhibition allExhibits = new Exhibition();
        exhibitionAncientRome.setTheme(Topic.ANCIENT_ROME);
        museum.addExhibition(exhibitionAncientRome);

        Exhibit armorHelmet = new Armor(true, true, Suit.HEAD);
        Exhibit vaseFromValyria = new Vase();
        Exhibit crown = new Crown(true, NUMBER_OF_DIAMONDS);

        armorHelmet.setStartDateInCurrentExhibition(
                new Date(HELMET_DAY, 2, HELMET_YEAR));
        vaseFromValyria.setStartDateInCurrentExhibition(
                new Date(VASE_DAY, 2, VASE_YEAR));
        crown.setStartDateInCurrentExhibition(
                new Date(CROWN_DAY, 2, CROWN_YEAR));

        armorHelmet.setTheme(Topic.ANCIENT_ROME);
        vaseFromValyria.setTheme(Topic.ANCIENT_GREECE);
        crown.setTheme(Topic.ANCIENT_ROME);

        armorHelmet.setCenturyOfCreation(ARMOR_CENTURY_OF_CREATION);
        vaseFromValyria.setCenturyOfCreation(VASE_CENTURY_OF_CREATION);
        crown.setCenturyOfCreation(CROWN_CENTURY_OF_CREATION);
        allExhibits.addExhibit(armorHelmet);
        allExhibits.addExhibit(vaseFromValyria);
        allExhibits.addExhibit(crown);


        ExhibitionManager unclePetro = new ExhibitionManagerImpl();

        exhibitionAncientRome.setExhibits(unclePetro.findByTheme(
                allExhibits.getExhibits(), Topic.ANCIENT_ROME));

        exhibitionAncientRome.getExhibits().forEach(System.out::println);

        unclePetro.sortByAge(exhibitionAncientRome.getExhibits(), false);

        exhibitionAncientRome.getExhibits().forEach(System.out::println);

        unclePetro.sortByTimeInCurrentExhibition(
                exhibitionAncientRome.getExhibits(), false);

        exhibitionAncientRome.getExhibits().forEach(System.out::println);
    }

}
