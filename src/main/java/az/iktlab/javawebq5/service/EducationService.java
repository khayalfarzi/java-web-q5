package az.iktlab.javawebq5.service;

import az.iktlab.javawebq5.dao.entity.EducationEntity;
import az.iktlab.javawebq5.dao.repository.EducationRepository;
import az.iktlab.javawebq5.mapper.EducationMapper;

import static az.iktlab.javawebq5.mapper.EducationMapper.INSTANCE;

import az.iktlab.javawebq5.model.EducationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    private static final Logger log = LoggerFactory.getLogger(EducationService.class);
    private final EducationRepository repository;

    public EducationService(EducationRepository repository) {
        this.repository = repository;
    }

    public void add(EducationDto education) {
        log.info("ActionLog.add start.");
        log.info("ActionLog.add start with parameters: {}", education);

        if (education.getName() == null) {
            log.error("ActionLog.add error occurred. education name is null.");
            throw new NullPointerException("EDUCATION_NAME_CANT_BE_NULL");
        }

        if (education.getDegree() == null) {
            log.warn("ActionLog.add warning !!! Null degree value is not preferable!");
        }

        EducationEntity entity = EducationMapper.INSTANCE.mapToEntity(education);

        try {
            repository.save(entity);
        } catch (Exception e) {
            log.error("ActionLog.add error occurred. {}", e.getMessage());
            log.trace("ActionLog.add error trace. {}", e.toString());

            throw e;
        }

        log.info("ActionLog.add end for parameters: {}", education);
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
