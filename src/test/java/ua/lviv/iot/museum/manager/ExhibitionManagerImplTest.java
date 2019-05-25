package ua.lviv.iot.museum.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.museum.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        exhibits.add(crown);
        exhibits.add(armor);
        exhibits.add(vase);
        exhibitsChecker.add(crown);
        exhibitsChecker.add(armor);
        exhibitsChecker.add(vase);

        assertEquals(exhibitsChecker, myManager.sortByAge(
                        exhibits  , false));

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

        exhibits.add(crown);
        exhibits.add(armor);
        exhibits.add(vase);
        exhibitsChecker.add(vase);
        exhibitsChecker.add(armor);
        exhibitsChecker.add(crown);


        assertEquals(exhibitsChecker, myManager.sortByTimeInCurrentExhibition(
                        exhibits  , false));
    }
}