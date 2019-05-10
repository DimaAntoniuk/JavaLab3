package ua.lviv.iot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.museum.models.Vase;
import ua.lviv.iot.second.VaseRepository;

import java.util.LinkedList;
import java.util.List;

@RestController
public class VaseController {

    @Autowired
    private VaseRepository repository;

    @RequestMapping(value = "/vase/", method = RequestMethod.GET)
    public List<Vase> getAllVases() {
        List<Vase> vases = new LinkedList<>();
        repository.findAll().forEach(vases::add);
        if(vases.isEmpty()) {
            return null;
        }
        return vases;
    }

    @RequestMapping(value = "/vase/{id}", method = RequestMethod.GET)
    public Vase getVase(@PathVariable Integer id) {
        if(repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/vase", method = RequestMethod.POST)
    public Vase postVase(@RequestBody Vase vase) {
        return repository.save(vase);
    }

    @RequestMapping(value = "/vase/{id}", method = RequestMethod.PUT)
    public Vase putVase(@RequestBody Vase vase, @PathVariable Integer id) {
        return repository.save(vase);
    }

    @RequestMapping(value = "/vase/{id}", method = RequestMethod.DELETE)
    public void deleteVase(@PathVariable Integer id) {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
        }
    }
}
