package ua.lviv.iot.museum.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.museum.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ua.lviv.iot.museum.manager.ExhibitionManagerImpl.createExhibits;

class ExhibitionManagerImplTest {

    @Test
    public void testFindByTheme() {
        Exhibit crown = new Crown();
        Exhibit armor = new Armor();
        Exhibit vase = new Vase();
        ExhibitionManagerImpl myManager = new ExhibitionManagerImpl();

        crown.setTheme(Topic.ANCIENT_ROME);
        armor.setTheme(Topic.ANCIENT_GREECE);
        vase.setTheme(Topic.WORLD_WAR_II);

        List<Exhibit> exhibits = new ArrayList<>();
        List<Exhibit> exhibitsChecker = new ArrayList<>();

        exhibits.add(crown);
        exhibits.add(armor);
        exhibits.add(vase);
        exhibitsChecker.add(crown);

        assertEquals(exhibitsChecker, myManager.findByTheme(
                exhibits , Topic.ANCIENT_ROME));
    }

    @Test
    public void testSortByAge() {
        Exhibit crown = new Crown();
        Exhibit armor = new Armor();
        Exhibit vase = new Vase();
        ExhibitionManagerImpl myManager = new ExhibitionManagerImpl();

        crown.setCenturyOfCreation(10);
        armor.setCenturyOfCreation(12);
        vase.setCenturyOfCreation(15);

        List<Exhibit> exhibits = new ArrayList<>();
        List<Exhibit> exhibitsChecker = new ArrayList<>();
        List<Exhibit> exhibitsCheckerReverse = new ArrayList<>();

        exhibits.add(crown);
        exhibits.add(armor);
        exhibits.add(vase);
        exhibitsChecker.add(crown);
        exhibitsChecker.add(armor);
        exhibitsChecker.add(vase);

        exhibitsCheckerReverse.add(vase);
        exhibitsCheckerReverse.add(armor);
        exhibitsCheckerReverse.add(crown);

        assertEquals(exhibitsChecker, myManager.sortByAge(
                        exhibits  , false));
        assertEquals(exhibitsCheckerReverse, myManager.sortByAge(
                exhibits  , true));

    }

    @Test
    public void testSortByTimeInCurrentExhibition() {
        Exhibit crown = new Crown();
        Exhibit armor = new Armor();
        Exhibit vase = new Vase();
        ExhibitionManagerImpl myManager = new ExhibitionManagerImpl();

        Date crownStartDate = new Date(20, 12, 2018);
        Date armorStartDate = new Date(19, 11, 2018);
        Date vaseStartDate = new Date(21, 10, 2018);
        crown.setStartDateInCurrentExhibition(crownStartDate);
        armor.setStartDateInCurrentExhibition(armorStartDate);
        vase.setStartDateInCurrentExhibition(vaseStartDate);

        List<Exhibit> exhibits = new ArrayList<>();
        List<Exhibit> exhibitsChecker = new ArrayList<>();
        List<Exhibit> exhibitsCheckerReverse = new ArrayList<>();

        exhibits.add(crown);
        exhibits.add(armor);
        exhibits.add(vase);
        exhibitsChecker.add(vase);
        exhibitsChecker.add(armor);
        exhibitsChecker.add(crown);

        exhibitsCheckerReverse.add(vase);
        exhibitsCheckerReverse.add(armor);
        exhibitsCheckerReverse.add(crown);


        assertEquals(exhibitsChecker, myManager.sortByTimeInCurrentExhibition(
                        exhibits  , false));
        assertEquals(exhibitsCheckerReverse, myManager.sortByTimeInCurrentExhibition(
                exhibits  , true));
    }

    @Test
    void main() {
        final int NUMBER_OF_DIAMONDS = 7;
        final int HELMET_DAY = 17;
        final int HELMET_YEAR = 2018;
        final int VASE_DAY = 15;
        final int VASE_YEAR = 2018;
        final int CROWN_DAY = 13;
        final int CROWN_YEAR = 2019;
        final int ARMOR_CENTURY_OF_CREATION = 19;
        final int VASE_CENTURY_OF_CREATION = 17;
        final int CROWN_CENTURY_OF_CREATION = 15;
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
        assertNotNull(allExhibits.getExhibits());
    }

    @Test
    void setExhibitsTest() {
        Exhibition exhibition = createExhibits();
        assertNotNull(exhibition);
    }
}