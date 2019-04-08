package ua.lviv.iot.lab8;

import ua.lviv.iot.museum.models.Vase;

import javax.transaction.Transactional;

@Transactional
public interface VaseRepository extends ExhibitRepository<Vase> {
}
