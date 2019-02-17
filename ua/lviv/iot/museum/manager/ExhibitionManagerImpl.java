package ua.lviv.iot.museum.manager;

import ua.lviv.iot.museum.models.*;
import ua.lviv.iot.museum.models.Date;

import java.io.Serializable;

import java.util.*;

public class ExhibitionManagerImpl implements ExhibitionManager , Serializable{

    @Override
    public List<Exhibit> findByTheme(List<Exhibit> listOfExhibits , Topic theme) {

        exhibits.clear();
        for (Exhibit exhibit:listOfExhibits){
            if(exhibit.getTheme().equals(theme)){
                exhibits.add(exhibit);
            }
        }
        return exhibits;
    }

    @Override
    public List<Exhibit> sortByAge(List<Exhibit> listOfExhibits, boolean reverse) {

        if(reverse) {
            listOfExhibits.sort((o1, o2) -> {
                Integer ageOfFirstExhibit = o1.getCenturyOfCreation();
                Integer ageOfSecondExhibit = o2.getCenturyOfCreation();
                return ageOfFirstExhibit.compareTo(ageOfSecondExhibit);
            });
            Collections.reverse(listOfExhibits);
            return listOfExhibits;
        } else {
            listOfExhibits.sort((o1, o2) -> {
                Integer ageOfFirstExhibit = o1.getCenturyOfCreation();
                Integer ageOfSecondExhibit = o2.getCenturyOfCreation();
                return ageOfFirstExhibit.compareTo(ageOfSecondExhibit);
            });
            return listOfExhibits;
        }

    }

    @Override
    public List<Exhibit> sortByTimeInCurrentExhibition(List<Exhibit> listOfExhibits, boolean reverse) {

        if(reverse) {
            listOfExhibits.sort((o1 , o2) -> {
                Date firstExhibitTime = o1.getStartDateInCurrentExhibition();
                Date secondExhibitTime = o2.getStartDateInCurrentExhibition();
                return firstExhibitTime.compareTo(secondExhibitTime);
            });
            return listOfExhibits;
        } else {
            listOfExhibits.sort((o1 , o2) -> {
                Date firstExhibitTime  = o1.getStartDateInCurrentExhibition();
                Date secondExhibitTime = o2.getStartDateInCurrentExhibition();
                return firstExhibitTime.compareTo(secondExhibitTime);
            });
            return listOfExhibits;
        }
    }

    public static void main(String[] args) {

        Museum museum = new Museum();
        Exhibition exhibitionAncientRome = new Exhibition();
        Exhibition allExhibits = new Exhibition();
        exhibitionAncientRome.setTheme(Topic.ANCIENT_ROME);
        museum.setExhibitions(exhibitionAncientRome);

        Exhibit armorHelmet = new Armor(true , true , Suit.HEAD);
        Exhibit vaseFromValyria = new Vase();
        Exhibit crown = new Crown(true , 7);

        armorHelmet.setStartDateInCurrentExhibition(new Date(17 , 2 , 2018));
        vaseFromValyria.setStartDateInCurrentExhibition(new Date(15 , 2 , 2018));
        crown.setStartDateInCurrentExhibition(new Date(13 , 2 , 2019));

        armorHelmet.setTheme(Topic.ANCIENT_ROME);
        vaseFromValyria.setTheme(Topic.ANCIENT_GREECE);
        crown.setTheme(Topic.ANCIENT_ROME);

        armorHelmet.setCenturyOfCreation(19);
        vaseFromValyria.setCenturyOfCreation(17);
        crown.setCenturyOfCreation(15);
        allExhibits.setExhibits(armorHelmet , vaseFromValyria , crown);

        ExhibitionManager unclePetro = new ExhibitionManagerImpl();

        exhibitionAncientRome.setExhibits(unclePetro.findByTheme(Arrays.asList(allExhibits.getExhibits()) ,
                Topic.ANCIENT_ROME).toArray(new Exhibit[0]));

        System.out.println(Arrays.toString(exhibitionAncientRome.getExhibits()));

        unclePetro.sortByAge(Arrays.asList(exhibitionAncientRome.getExhibits()) , false);

        System.out.println(Arrays.toString(exhibitionAncientRome.getExhibits()));

        unclePetro.sortByTimeInCurrentExhibition(Arrays.asList(exhibitionAncientRome.getExhibits()) , false);

        System.out.println(Arrays.toString(exhibitionAncientRome.getExhibits()));
    }

}
