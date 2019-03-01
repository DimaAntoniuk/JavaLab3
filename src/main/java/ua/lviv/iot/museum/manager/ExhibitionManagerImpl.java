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

import java.io.Serializable;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ExhibitionManagerImpl implements ExhibitionManager, Serializable {

    private static final int numberOfDiamonds = 7;
    private static final int helmetDay = 17;
    private static final int helmetYear = 2018;
    private static final int vaseDay = 15;
    private static final int vaseYear = 2018;
    private static final int crownDay = 13;
    private static final int crownYear = 2019;
    private static final int armorCenturyOfCreation = 19;
    private static final int vaseCenturyOfCreation = 17;
    private static final int crownCenturyOfCreation = 15;

    @Override
    public final List<Exhibit> findByTheme(final List<Exhibit> listOfExhibits,
                                     final Topic theme) {

        return listOfExhibits.stream().filter(exhibit ->
                exhibit.getTheme() == theme).collect(Collectors.toList());
    }

    @Override
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

    @Override
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
        Exhibit crown = new Crown(true, numberOfDiamonds);

        armorHelmet.setStartDateInCurrentExhibition(
                new Date(helmetDay, 2, helmetYear));
        vaseFromValyria.setStartDateInCurrentExhibition(
                new Date(vaseDay, 2, vaseYear));
        crown.setStartDateInCurrentExhibition(
                new Date(crownDay, 2, crownYear));

        armorHelmet.setTheme(Topic.ANCIENT_ROME);
        vaseFromValyria.setTheme(Topic.ANCIENT_GREECE);
        crown.setTheme(Topic.ANCIENT_ROME);

        armorHelmet.setCenturyOfCreation(armorCenturyOfCreation);
        vaseFromValyria.setCenturyOfCreation(vaseCenturyOfCreation);
        crown.setCenturyOfCreation(crownCenturyOfCreation);
        allExhibits.addExhibit(armorHelmet);
        allExhibits.addExhibit(vaseFromValyria);
        allExhibits.addExhibit(crown);

        ExhibitionManager unclePetro = new ExhibitionManagerImpl();

        exhibitionAncientRome.setExhibits(unclePetro.findByTheme(
                allExhibits.getExhibits(), Topic.ANCIENT_ROME));

        System.out.println(
                Arrays.toString((
                        exhibitionAncientRome.getExhibits()).toArray()));

        unclePetro.sortByAge(
                exhibitionAncientRome.getExhibits(), false);

        System.out.println(
                Arrays.toString((
                        exhibitionAncientRome.getExhibits()).toArray()));

        unclePetro.sortByTimeInCurrentExhibition(
                exhibitionAncientRome.getExhibits(), false);

        System.out.println(
                Arrays.toString((
                        exhibitionAncientRome.getExhibits()).toArray()));
    }

}
