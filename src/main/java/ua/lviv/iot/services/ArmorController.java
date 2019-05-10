package ua.lviv.iot.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.museum.models.Armor;
import ua.lviv.iot.second.ArmorRepository;

@RestController
public class ArmorController {

    @Autowired
    private ArmorRepository repository;

    @GetMapping("/armor/{id}")
    public Armor getArmor(@PathVariable Integer id) {
        return repository.findById(id).get();
    }

    @PostMapping("/armor")
    public Armor postArmor(@RequestBody Armor armor) {
        return repository.save(armor);
    }

    @PutMapping("/armor/{id}")
    public Armor putArmor(@RequestBody Armor armor, @PathVariable Integer id) {
        return repository.save(armor);
    }

    @DeleteMapping("/armor/{id}")
    public void deleteArmor(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
