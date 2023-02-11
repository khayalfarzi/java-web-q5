package az.iktlab.javawebq5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link az.iktlab.javawebq5.dao.entity.EducationEntity} entity
 */
@Data
@Builder
public class EducationDto implements Serializable {
    private final Long id;
    private final String name;
    private final String degree;
}