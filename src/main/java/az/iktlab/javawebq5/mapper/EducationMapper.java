package az.iktlab.javawebq5.mapper;

import az.iktlab.javawebq5.dao.entity.EducationEntity;
import az.iktlab.javawebq5.model.EducationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class EducationMapper {

    public static final EducationMapper INSTANCE = Mappers.getMapper(EducationMapper.class);

    public abstract EducationEntity mapToEntity(EducationDto education);

    public abstract EducationDto mapToDto(EducationEntity entity);

    public abstract List<EducationDto> mapToDtos(List<EducationEntity> entities);
}
