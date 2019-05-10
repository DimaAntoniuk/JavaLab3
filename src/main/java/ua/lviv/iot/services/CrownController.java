package ua.lviv.iot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.museum.models.Crown;
import ua.lviv.iot.second.CrownRepository;

@RestController
public class CrownController {

    @Autowired
    private CrownRepository repository;

    @GetMapping("/crown/{id}")
    public Crown getCrown(@PathVariable Integer id) {
        return repository.findById(id).get();
    }

    @PostMapping("/crown")
    public Crown postCrown(@RequestBody Crown crown) {
        return repository.save(crown);
    }

    @PutMapping("/crown/{id}")
    public Crown putCrown(@RequestBody Crown crown, @PathVariable Integer id) {
        return repository.save(crown);
    }

    @DeleteMapping("/crown/{id}")
    public void deleteCrown(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}

