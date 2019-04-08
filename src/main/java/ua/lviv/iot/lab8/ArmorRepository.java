package ua.lviv.iot.lab8;

import ua.lviv.iot.museum.models.Armor;

import javax.transaction.Transactional;

@Transactional
public interface ArmorRepository extends ExhibitRepository<Armor>{
}
