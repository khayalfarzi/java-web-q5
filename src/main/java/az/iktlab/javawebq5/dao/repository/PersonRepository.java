package az.iktlab.javawebq5.dao.repository;

import az.iktlab.javawebq5.dao.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    Optional<List<PersonEntity>> findAllByName(String name);
}
