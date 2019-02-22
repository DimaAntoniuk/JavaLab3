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
        museum.setExhibitions(exhibitionAncientRome);

        Exhibit armorHelmet = new Armor(true, true, Suit.HEAD);
        Exhibit vaseFromValyria = new Vase();
        Exhibit crown = new Crown(true, 7);

        armorHelmet.setStartDateInCurrentExhibition(new Date(17, 2, 2018));
        vaseFromValyria.setStartDateInCurrentExhibition(new Date(15, 2, 2018));
        crown.setStartDateInCurrentExhibition(new Date(13, 2, 2019));

        armorHelmet.setTheme(Topic.ANCIENT_ROME);
        vaseFromValyria.setTheme(Topic.ANCIENT_GREECE);
        crown.setTheme(Topic.ANCIENT_ROME);

        armorHelmet.setCenturyOfCreation(19);
        vaseFromValyria.setCenturyOfCreation(17);
        crown.setCenturyOfCreation(15);
        allExhibits.setExhibits(armorHelmet, vaseFromValyria, crown);

        ExhibitionManager unclePetro = new ExhibitionManagerImpl();

        exhibitionAncientRome.setExhibits(unclePetro.findByTheme(
                Arrays.asList(allExhibits.getExhibits()),
                Topic.ANCIENT_ROME).toArray(new Exhibit[0]));

        System.out.println(
                Arrays.toString(exhibitionAncientRome.getExhibits()));

        unclePetro.sortByAge(
                Arrays.asList(exhibitionAncientRome.getExhibits()), false);

        System.out.println(Arrays.toString(
                exhibitionAncientRome.getExhibits()));

        unclePetro.sortByTimeInCurrentExhibition(
                Arrays.asList(exhibitionAncientRome.getExhibits()), false);

        System.out.println(
                Arrays.toString(exhibitionAncientRome.getExhibits()));
    }

}
