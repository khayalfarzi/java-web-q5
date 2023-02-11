package az.iktlab.javawebq5.service;

import az.iktlab.javawebq5.dao.entity.PersonEntity;
import az.iktlab.javawebq5.model.PersonDto;
import az.iktlab.javawebq5.dao.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(PersonDto person) {

        PersonEntity entity = new PersonEntity();
        entity.setName(person.getName());
        entity.setGender(person.getGender());
        entity.setSurname(person.getSurname());
        entity.setBirthDate(person.getBirthDate());

        personRepository.save(entity);
    }

    public void update(PersonDto person) {

        var entity = personRepository.getById(person.getId());

        entity.setName(person.getName());
        entity.setSurname(person.getSurname());
        entity.setGender(person.getGender());
        entity.setBirthDate(person.getBirthDate());

        personRepository.save(entity);
    }

    public void deleteAll() {
        personRepository.deleteAll();
    }

    public Long deleteById(Long id) {
        personRepository.deleteById(id);
        return id;
    }

    public PersonDto getById(Long id) {
        var entity = personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PERSON ID NOT FOUND"));

        return buildPersonDto(entity);
    }

    public List<PersonDto> getAllByName(String name) {
        return personRepository.findAllByName(name)
                .orElse(new ArrayList<>())
                .stream()
                .map(this::buildPersonDto)
                .collect(Collectors.toList());
    }

    public List<PersonDto> getAll() {
        return personRepository.findAll()
                .stream()
                .map(this::buildPersonDto)
                .collect(Collectors.toList());
    }

    private PersonDto buildPersonDto(PersonEntity entity) {
        return PersonDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .surname(entity.getSurname())
                .birthDate(entity.getBirthDate())
                .gender(entity.getGender()).build();
    }
}
