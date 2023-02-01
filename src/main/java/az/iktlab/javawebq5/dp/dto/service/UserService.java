package az.iktlab.javawebq5.dp.dto.service;

import az.iktlab.javawebq5.dp.dto.dtoo.SimpleUserDetailDto;
import az.iktlab.javawebq5.dp.dto.dtoo.UserDto;
import az.iktlab.javawebq5.dp.dto.entity.UserEntity;
import az.iktlab.javawebq5.dp.dto.repo.UserRepo;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private final UserRepo repo = new UserRepo();

    public void save(UserDto user) {

        UserEntity entity = new UserEntity();
        entity.setPass(user.getPass());
        entity.setName(user.getName());
        entity.setSurname(user.getSurname());
        entity.setUsername(user.getUname());

        repo.save(entity);
    }

    public List<SimpleUserDetailDto> findAll() {
        return repo.getAll()
                .stream()
                .map(u -> new SimpleUserDetailDto(u.getName(), u.getSurname()))
                .collect(Collectors.toList());
    }

}
