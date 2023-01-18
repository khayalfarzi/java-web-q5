package az.iktlab.javawebq5.controller;

import az.iktlab.javawebq5.model.Person;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class HelloSpringController {

    private static final List<Person> people = new ArrayList<>();

    @GetMapping
    public List<Person> getHello() {
        return people;
    }

    @PostMapping("/save")
    public void savePerson(@RequestBody Person person) {
        people.add(person);
    }

    @DeleteMapping("/id")
    public void deleteById(@RequestParam("id") long id) {
        people.removeIf(p -> p.getId() == id);
    }

    @DeleteMapping("/id/v1")
    public void deleteByIdV1(@RequestParam("id") long id,
                             @RequestParam("name") String name) {
        System.out.println(name);
        people.removeIf(p -> p.getId() == id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteByIdV2(@PathVariable("id") long id) {
        people.removeIf(p -> p.getId() == id);
    }

    @DeleteMapping
    public void deleteAll() {
        people.clear();
    }

    @GetMapping("/id/{id}")
    public Person getById(@PathVariable long id) {
        return people.stream()
                .filter(p -> p.getId() == id).findAny()
                .orElseThrow(() -> {
                    throw new RuntimeException("PERSON ID NOT FOUND");
                });
    }
}
