package ua.lviv.iot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.museum.models.Vase;
import ua.lviv.iot.second.VaseRepository;

@RestController
public class VaseController {

    @Autowired
    private VaseRepository repository;

    @GetMapping("/vase/{id}")
    public Vase getVase(@PathVariable Integer id) {
        return repository.findById(id).get();
    }

    @PostMapping("/vase")
    public Vase postVase(@RequestBody Vase vase) {
        return repository.save(vase);
    }

    @PutMapping("/vase/{id}")
    public Vase putVase(@RequestBody Vase vase, @PathVariable Integer id) {
        return repository.save(vase);
    }

    @DeleteMapping("/vase/{id}")
    public void deleteVase(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
