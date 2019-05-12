package ua.lviv.iot.second;

import ua.lviv.iot.museum.models.Vase;

import javax.transaction.Transactional;

@Transactional
public interface VaseRepository extends ExhibitRepository<Vase> {
}
