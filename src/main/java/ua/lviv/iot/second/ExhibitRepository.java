package ua.lviv.iot.second;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.museum.models.Exhibit;

public interface ExhibitRepository<T extends Exhibit> extends CrudRepository<T, Integer> {
}
