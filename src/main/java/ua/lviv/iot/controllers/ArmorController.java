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

    @RequestMapping(value = "/armor", method = RequestMethod.PUT)
    public Armor putArmor(@RequestBody Armor newArmor) {
        return repository.save(newArmor);
    }

    @RequestMapping(value = "/armor/{id}", method = RequestMethod.DELETE)
    public void deleteArmor(@PathVariable Integer id) {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
        }
    }
}