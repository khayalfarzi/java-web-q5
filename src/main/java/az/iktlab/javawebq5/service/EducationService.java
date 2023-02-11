package az.iktlab.javawebq5.service;

import az.iktlab.javawebq5.dao.entity.EducationEntity;
import az.iktlab.javawebq5.dao.repository.EducationRepository;
import az.iktlab.javawebq5.mapper.EducationMapper;

import static az.iktlab.javawebq5.mapper.EducationMapper.INSTANCE;

import az.iktlab.javawebq5.model.EducationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    private final EducationRepository repository;

    public EducationService(EducationRepository repository) {
        this.repository = repository;
    }

    public void add(EducationDto education) {
        EducationEntity entity = EducationMapper.INSTANCE.mapToEntity(education);

        repository.save(entity);
    }

    public void update(EducationDto education) {

        var entity = repository.findById(education.getId())
                .orElseThrow(() -> new RuntimeException("EDUCATION_ID_NOT_FOUND"));

        entity.setName(education.getName());
        entity.setDegree(education.getDegree());

        repository.save(entity);
    }

    public List<EducationDto> getAll() {
        return INSTANCE.mapToDtos(repository.findAll());
    }
}
