package az.iktlab.javawebq5.model;

import az.iktlab.javawebq5.entity.Gender;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DTO for the {@link az.iktlab.javawebq5.entity.PersonEntity} entity
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