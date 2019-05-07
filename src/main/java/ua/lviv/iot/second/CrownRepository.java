package ua.lviv.iot.second;

import ua.lviv.iot.museum.models.Crown;

import javax.transaction.Transactional;

@Transactional
public interface CrownRepository extends ExhibitRepository<Crown> {
}
