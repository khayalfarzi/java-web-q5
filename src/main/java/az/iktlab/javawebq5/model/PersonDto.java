package az.iktlab.javawebq5.model;

import az.iktlab.javawebq5.dao.entity.Gender;
import az.iktlab.javawebq5.dao.entity.PersonEntity;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link PersonEntity} entity
 */
@Data
@Builder
public class PersonDto implements Serializable {
    private final Long id;
    private final String name;
    private final String surname;
    private final LocalDate birthDate;
    private final Gender gender;
}