package ua.lviv.iot.lab8;

import ua.lviv.iot.museum.models.Painting;

import javax.transaction.Transactional;

@Transactional
public interface PaintingRepository extends ExhibitRepository<Painting> {
}
