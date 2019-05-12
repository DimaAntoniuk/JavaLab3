package ua.lviv.iot.second;

import ua.lviv.iot.museum.models.Painting;


import javax.transaction.Transactional;

@Transactional
public interface PaintingRepository extends ExhibitRepository<Painting> {
}
