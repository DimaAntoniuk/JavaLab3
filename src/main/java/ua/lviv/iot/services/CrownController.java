package ua.lviv.iot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.museum.models.Crown;
import ua.lviv.iot.second.CrownRepository;

import java.util.LinkedList;
import java.util.List;

@RestController
public class CrownController {

    @Autowired
    private CrownRepository repository;

    @RequestMapping(value = "/crown/", method = RequestMethod.GET)
    public List<Crown> getAllCrowns() {
        List<Crown> crowns = new LinkedList<>();
        repository.findAll().forEach(crowns::add);
        if(crowns.isEmpty()) {
            return null;
        }
        return crowns;
    }

    @RequestMapping(value = "/crown/{id}", method = RequestMethod.GET)
    public Crown getCrown(@PathVariable Integer id) {
        if(repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        return null;
    }

    @RequestMapping(value = "/crown", method = RequestMethod.POST)
    public Crown postCrown(@RequestBody Crown crown) {
        return repository.save(crown);
    }

    @RequestMapping(value = "/crown/{id}", method = RequestMethod.PUT)
    public Crown putCrown(@RequestBody Crown crown, @PathVariable Integer id) {
        return repository.save(crown);
    }

    @RequestMapping(value = "/crown/{id}", method = RequestMethod.DELETE)
    public void deleteCrown(@PathVariable Integer id) {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
        }
    }
}

