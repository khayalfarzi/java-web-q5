package az.iktlab.javawebq5.dao.repository;

import az.iktlab.javawebq5.dao.entity.ERole;
import az.iktlab.javawebq5.dao.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}