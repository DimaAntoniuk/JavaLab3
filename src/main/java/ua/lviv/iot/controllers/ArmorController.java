package ua.lviv.iot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.museum.models.Armor;
import ua.lviv.iot.second.ArmorRepository;

import java.util.LinkedList;
import java.util.List;

@RestController
public class ArmorController {

    @Autowired
    private ArmorRepository repository;

    @RequestMapping(value = "/armor/", method = RequestMethod.GET)
    public List<Armor> getAllArmors() {
        List<Armor> armors = new LinkedList<>();
        repository.findAll().forEach(armors::add);
        if(armors.isEmpty()) {
            return null;
        }
        return armors;
    }

    @RequestMapping(value = "/armor/{id}", method = RequestMethod.GET)
    public Armor getArmor(@PathVariable Integer id) {
        if(repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/armor", method = RequestMethod.POST)
    public Armor postArmor(@RequestBody Armor armor) {
        return repository.save(armor);
    }

    @RequestMapping(value = "/armor/{id}", method = RequestMethod.PUT)
    public Armor putArmor(@RequestBody Armor newArmor, @PathVariable Integer id) {
        return repository.findById(id)
                .map(armor -> {
                    armor.setName(newArmor.getName());
                    armor.setPortable(newArmor.isPortable());
                    armor.setCenturyOfCreation(newArmor.getCenturyOfCreation());
                    armor.setCountryOfCreation(newArmor.getCountryOfCreation());
                    armor.setSize(newArmor.getSize());
                    armor.setPopularity(newArmor.getPopularity());
                    armor.setTheme(newArmor.getTheme());
                    armor.setDestroyedInPercentage(newArmor.getDestroyedInPercentage());
                    armor.setStartDateInCurrentExhibition(newArmor.getStartDateInCurrentExhibition());
                    armor.setMadeOfMetal(newArmor.isMadeOfMetal());
                    armor.setPattern(newArmor.isPattern());
                    armor.setSuit(newArmor.getSuit());
                    return repository.save(armor);
                }).orElseGet(() -> {
                    newArmor.setId(id);
                    return repository.save(newArmor);
                });
    }

    @RequestMapping(value = "/armor/{id}", method = RequestMethod.DELETE)
    public void deleteArmor(@PathVariable Integer id) {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
        }
    }
}