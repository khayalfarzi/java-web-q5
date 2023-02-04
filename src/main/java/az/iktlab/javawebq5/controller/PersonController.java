package az.iktlab.javawebq5.controller;

import az.iktlab.javawebq5.entity.PersonEntity;
import az.iktlab.javawebq5.model.PersonDto;
import az.iktlab.javawebq5.service.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void save(@RequestBody PersonDto person) {
        personService.save(person);
    }

    @PutMapping
    public void update(@RequestBody PersonDto person) {
        personService.update(person);
    }

    @DeleteMapping
    public void deleteAll() {
        personService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public Long deleteById(@PathVariable Long id) {
        return personService.deleteById(id);
    }

    @GetMapping("/id/{id}")
    public PersonDto getById(@PathVariable Long id) {
        return personService.getById(id);
    }

    @GetMapping("/name/{name}")
    public List<PersonDto> getAllByName(@PathVariable String name) {
        return personService.getAllByName(name);
    }

    @GetMapping
    public List<PersonDto> getAll() {
        return personService.getAll();
    }
}
