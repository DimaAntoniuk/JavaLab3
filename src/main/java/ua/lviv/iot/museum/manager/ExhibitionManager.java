package ua.lviv.iot.museum.manager;

import ua.lviv.iot.museum.models.Exhibit;
import ua.lviv.iot.museum.models.Topic;

import java.util.List;

public interface ExhibitionManager {

    List<Exhibit> findByTheme(List<Exhibit> listOfExhibits, Topic theme);
    List<Exhibit> sortByAge(List<Exhibit> listOfExhibits, boolean reverse);
    List<Exhibit> sortByTimeInCurrentExhibition(List<Exhibit> listOfExhibits,
                                                boolean reverse);

}
